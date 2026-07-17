//Print the stack without using built in function  - process 1 using an array 

/*steps: 1.copy into arr in reverse order while popping 
         2.print stack forward and pushing again in stack  */
package Stacks;
import java.util.Stack;

public class printStack2 {
     public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(89);
        st.push(17);
        st.push(72);

        int n=st.size();
        int[] arr= new int[n];
        
        for(int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }

        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);
        }
     }
}
