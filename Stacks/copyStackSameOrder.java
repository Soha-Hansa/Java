package Stacks;
import java.util.Scanner;
import java.util.Stack;
public class copyStackSameOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Stack <Integer> st = new Stack<>();
        int n;
        System.out.println("How many elements want to insert ?: ");
        n=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        
        System.out.println("Elements in the stack: "+st);

        System.out.println("Stack in reverse order: ");
        Stack <Integer> rt= new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        System.out.println(rt);

        System.out.println("Copying the stack in same order: ");
        Stack <Integer> gt= new Stack<>();
        while(!rt.isEmpty()){
            gt.push(rt.pop());
        }
        System.out.println(gt);
        sc.close();

    }
}
