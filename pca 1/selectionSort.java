public class selectionSort {
     public static void main(String[] args) {
        int n=args.length;
        int[] arr= new int[args.length]; int temp;
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i;j<=n-1;j++){
                 if(min>arr[j]){
                     mindex=j;
                     min=arr[j];
                 }
                 temp=arr[i];
                 arr[i]=arr[mindex];
                 arr[mindex]=temp;
            }
        }
        System.out.println("Sorted array is: ");
         for(int i=0;i<=n;i++){
             System.out.print(arr[i]+" ");
         }
    }
}
