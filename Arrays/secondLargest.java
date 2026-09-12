import java.util.Scanner;
public class secondLargest {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements you want to insert: ");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements you want to insert: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }          
            
        }
        System.out.println("Second largest element in the array: "+smax);
    }
}
