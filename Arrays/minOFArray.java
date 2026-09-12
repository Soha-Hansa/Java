import java.util.Scanner;

public class minOFArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements you want to insert: ");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements you want to insert: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min element in the array is: "+min);
    }
}
