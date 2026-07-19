//Remove the element at index 
package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class removeAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(89);
        st.push(17);
        st.push(72);
        st.push(128);
        Scanner sc= new Scanner(System.in);
        Stack <Integer>rt=new Stack<>();
        System.out.println("Enter the index to remove the value");
        int idx= sc.nextInt();
        
        while(st.size()>idx+1){
            rt.push(st.pop());
        }
        st.pop();
        while(!rt.isEmpty()){
            st.push(rt.pop());
        }
        System.out.print("After updating the stack is: "+st);
        
    }
}
