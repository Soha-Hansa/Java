//Print the stack without using built in function  - process 1: using another stack
package Stacks;
import java.util.Stack;
public class printStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(89);
        st.push(17);
        st.push(72);
        
        Stack <Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }

        while(!temp.isEmpty()){
            int val=temp.pop();
            System.out.print(val+" ");
            st.push(val);
        }
        System.out.println();
        System.out.println(st);
    }
}
