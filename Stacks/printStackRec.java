package Stacks;

import java.util.Stack;

public class printStackRec {
    
    public static void displayRec(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int top=st.peek();
        displayRec(st);
        System.out.print  (top+" ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(89);
        st.push(17);
        st.push(72);

        System.out.println("Recursively stack print: ");
        displayRec(st);
    }
}
