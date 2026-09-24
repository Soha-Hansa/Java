/* 1!+ 4! + 5! */
class KrishnaMurthy{
    public static void main(String[] args) {
    int num=Integer.parseInt(args[0]);
    int origional=num;int ld, sum=0,fact;
    while(num>0){
        ld=num%10;
        fact=1;
        for(int i=1;i<=ld;i++){
            fact=fact*i;
        }
        sum+=fact;
        num=num/10;
    }
    if(origional!=sum){
        System.out.println(origional+" is not a krishnamurthy number");
    }else{
        System.out.println(origional+" is a KrishnaMurthy number");
    }
    }
}