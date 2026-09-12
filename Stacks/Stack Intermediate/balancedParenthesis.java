import java.util.*;
public class balancedParenthesis{

    public static boolean isBalanced(String str){
        Stack<Character> st= new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch= str.charAt(i);
            if(ch=='(') st.push(ch);
            if(st.isEmpty())return false;
            if(st.peek()=='(') st.pop();
        }
        if(!st.isEmpty())return false;
        else return true;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Input string: ");
    String str =sc.nextLine();
    System.out.println("Generated output: "+isBalanced(str));    
    }
}

/*
 Explanation: if(st.isEmpty())return false;

st.isEmpty() checks if the stack has no elements.
If the stack is empty but you encounter a closing parenthesis, it means there’s 
no matching opening parenthesis to pair with.
In that case, the string cannot be balanced, so the method immediately returns false. */

/*
Leetcode 20: Valid parenthesis : 
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        if (st.isEmpty()) return true;
        else return false;
    }
}

 */