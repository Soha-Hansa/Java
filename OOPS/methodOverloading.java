public class methodOverloading {
    public static int add(int a , int b){
        return a+b;
    }
    public static double add(double a , double b){
        return a+b;
    }
    public static float add(float a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(10.0,12));
    }
}
