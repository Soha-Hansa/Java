class reverseArr{
    public static void main(String[] args) {
        int n=args.length;
        int[] arr= new int[n];
        int temp,j=args.length-1;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        System.out.println("Reverse of array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}