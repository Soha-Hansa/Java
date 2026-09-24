public class reverseDigit{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int ld,r=0;
        while(n>0){
            ld=n%10;
            r=(r*10)+ld;
            n=n/10;
        }
        System.out.println("Reverse of digit is: "+r);
    }
}