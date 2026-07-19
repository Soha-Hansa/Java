package Stacks;

public class linkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
        Node head=null;
        int size=0;
        void push(int value){
            Node temp =new Node(value);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayRev(){
            if(head==null){
                System.out.println("Stack is empty nothing to print");
                return;
            }
            Node temp=head;
            System.out.print("Stack (top to bottom): ");
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void displayReverse(Node h){
                if(h==null)return;
                displayReverse(h.next);
                System.out.print(h.val+" ");
        }
        void display(){
            if(head==null){
                System.out.println("Stack is empty nothing to print");
                return;
            }
            System.out.print("Stack (bottom to top): ");
            displayReverse(head);
            System.out.println();
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            return head==null;
        }
        int peek(){
            if(head==null)return -1;
            else return head.val;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty nothing to pop");
                return -1;
            }
            int x= head.val;
            size--;
            head=head.next;
            return x;
        }
        
    }
    public static void main(String[] args) {
        LLStack st= new LLStack();
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
        st.displayRev();
        
    }
}
