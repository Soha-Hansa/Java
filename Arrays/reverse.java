import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements you want to insert: ");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements you want to insert: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=arr.length-1;int temp;
        for(int i=0;i<arr.length/2;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
        System.out.println("Reverse of the array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
