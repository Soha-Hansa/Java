public class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (sol.isPowerOfTwo(n)) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is NOT a power of two.");
        }

        sc.close();
    }
}
