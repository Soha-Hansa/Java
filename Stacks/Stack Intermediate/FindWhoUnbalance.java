/*
question: which element cause inbalance in stack:
Strategy
Push opening brackets onto the stack as usual.
On closing brackets:
    If the stack is empty → this closing bracket is extra, mark it as removable.
    If the top doesn’t match → this closing bracket is mismatched, mark it as removable.
Otherwise, pop the stack.
After the loop:
    Any leftover opening brackets in the stack are unmatched, so they’re removable too. */

    
import java.util.*;
public class FindWhoUnbalance {
    public static char whoDisbalance(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch == '(') {
                st.push(ch);
            } else if(ch == ')') {
                if(st.isEmpty()) return ch; // extra closing bracket
                char top = st.peek();
                if(top == '(') {
                    st.pop();
                } else {
                    return ch; // mismatched closing bracket
                }
            }
        }
        if(!st.isEmpty()) {
            return st.pop(); // leftover opening bracket
        }
        return '✓'; // balanced case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input string: ");
        String str = sc.nextLine();
        System.out.println("Generated output: " + whoDisbalance(str));    
    }
}
