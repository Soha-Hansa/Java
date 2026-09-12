import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements you want to insert: ");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements you want to insert: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element whose sum you want to find: ");
        int find=sc.nextInt();
        int i=0;
        int j=(arr.length-1);
        boolean found=false;
        Arrays.sort(arr);
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==find){
                System.out.println(arr[i]+" + "+arr[j]);
                found=true;
                break;
            }else if(sum<find){
                i++;
            }else{
                j--;
            }
        }
        if(!found){
            System.out.println("No such pair found");
        }
    }
}
