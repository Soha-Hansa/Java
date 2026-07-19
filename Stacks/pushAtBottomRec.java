//Insert element at the last using recursion 
package Stacks;

import java.util.Scanner;
import java.util.Stack;
public class pushAtBottomRec {

    public static void  pushEnd(Stack<Integer>st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }
        int top=st.pop();
        pushEnd(st, val);
        st.push(top);
       
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(89);
        st.push(17);
        st.push(72);

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value to insert : ");
        int val=sc.nextInt();

        pushEnd(st,val);
        System.out.println(st);

    }
}

/*
time complexity : O(n)
space complexity : O(n) */