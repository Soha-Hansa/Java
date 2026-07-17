//Insert element at any index 

package Stacks;

import java.util.Scanner;
import java.util.Stack;
public class insertAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(89);
        st.push(17);
        System.out.println(st);
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the index to insert: ");
        int idx= sc.nextInt();

        System.out.println("Enter the element to insert: ");
        int element=sc.nextInt();

        if (idx < 0 || idx > st.size()) {
        System.out.println("Invalid index");
        sc.close();
        return;
        }       


        Stack<Integer> temp = new Stack<>();

        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push( element);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.print("After inserting the Stack is: "+st);

        sc.close();

    }
}