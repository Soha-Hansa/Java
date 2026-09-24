public class gcd {
    public static int gcd_find(int a,int b){
        if(b==0){
            return a;
        }
        return gcd_find(b,a%b);
    }

    public static void main(String[] args) {
        int a=12;
        int b=9;
        int rel=gcd_find(a,b);
        System.out.println("Result is : "+rel);
    }
}