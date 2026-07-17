package Stacks;
import java.util.Stack;

public class printStackReverseRecursion {
    public static void displayReverseRec(Stack<Integer>st){
        if(st.isEmpty()){
            return;
        }
        int temp=st.pop();
        System.out.print(temp+" ");
        displayReverseRec(st);
        st.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(89);
        st.push(17);
        st.push(72);

        System.out.println("Recursively stack print: ");
        displayReverseRec(st);
    }
}
