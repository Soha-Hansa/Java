import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements you want to insert: ");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements you want to insert: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search ? :");
        int x=sc.nextInt();
        
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element found at index "+i);
                found=true;
                break;
            }
            
        }
        if(!found){
            System.out.println("Element not found");
        }
    
        sc.close();
    }
}
