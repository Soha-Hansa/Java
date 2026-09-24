public class lcm{
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static int lcm_find(int a, int b){
        a =Math.abs(a);
         b=Math.abs(b);
         if(a==0 || b==0){
             return 0;
         }
         return (a/gcd(a,b))*b;
    }
    public static void main(String[] args) {
        int a=12;
        int b=14;
        int rel=lcm_find(a,b);
        System.out.println("LCM OF "+a +" and "+b+" is: "+rel);
    }
}