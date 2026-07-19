/*Implementation of Stack using array 
push, pop, peek, size, isempty, isfull , display implementation  */
package Stacks;

public class arrayImplementation {
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;

        void push(int num){
            if(idx==arr.length){
                System.out.println("Stack is full no space to insert");
            }
            arr[idx]=num;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is empty no item to show");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is empty no item to pop ");
                return -1;
            }
            int popped=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return popped;                                        
        }
        void display(){
            if(idx==0){
                System.out.println("Stack is empty no item to display");
            }
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }

        boolean isEmpty(){
            return (size()==0);
        }
        boolean isFull(){
            return (size()==arr.length);
        }
    }
      public static void main(String[] args) {
        Stack st= new Stack();
       System.out.println("Is stack Empty? "+st.isEmpty()); 
        st.push(5);
        st.display();
        st.push(8);
        st.display();
        st.push(13);
        st.display();
        st.push(21);

        st.display();
        st.pop();
        st.display();
        System.out.println("Top element is: " + st.peek());

        st.push(15);
        st.push(72);
        st.display();   
        st.size();
        System.out.println("Is stack full? "+st.isFull()); 
        
      }
}
