import java.util.Scanner;

public class numberSquare2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dimention: ");
        int n=sc.nextInt();
        for(int  i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
