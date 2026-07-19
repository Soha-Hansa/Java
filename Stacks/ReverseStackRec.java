package Stacks;


import java.util.Stack;
public class ReverseStackRec {
    public static void pushAtBottom(Stack<Integer>st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top=st.pop();
        pushAtBottom(st, val);
        st.push(top);
    }
    public static void reverseRec(Stack<Integer>st){
        if(st.isEmpty())return;
        int top=st.pop();
        reverseRec(st);
        pushAtBottom(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(89);
        st.push(17);
        st.push(72);


        reverseRec(st);

        System.out.print("After reverse the stack is: "+st);
    }
}
