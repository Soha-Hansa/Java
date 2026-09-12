public class passingArrayToMethods {
    public static void swap(int[]a, int[]b){
        int temp=a[0];
        a[0]=b[0];
        b[0]=temp;
    }
    public static void main(String[] args) {
        int []a={5};
        int []b={10};
        System.out.println(a[0]+" "+b[0]);
        swap(a,b);
        System.out.println(a[0]+" "+b[0]);
    }
}
