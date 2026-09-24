public class armstrong{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        double sum=0,ld;
        double ele;
        int origional=n,count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        n=origional;
        while(n>0){
            ld=n%10;
            ele=Math.pow(ld,count);
            sum=sum+ele;
            n=n/10;
        }
        if(origional !=sum) {
            System.out.println("Not a armstring number");
        }else{
            System.out.println("Armstrong number");
        }
    }

}