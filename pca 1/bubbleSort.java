public class bubbleSort {
    public static void main(String[] args) {
        int n=args.length;
        int temp;
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        System.out.println("Sorted array is: ");
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
