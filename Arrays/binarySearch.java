import java.util.Scanner;

class binarySearch {
    public static void main(String[] args) {
        int[] arr;
        int target;

        // If command line arguments are passed
        if (args.length >= 2) {
            arr = new int[args.length - 1];
            for (int i = 0; i < args.length - 1; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            target = Integer.parseInt(args[args.length - 1]);
        } 
        // If run directly (e.g., clicking Run button in VS Code without arguments)
        else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            arr = new int[n];
            System.out.println("Enter " + n + " elements (in sorted order): ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the element you want to search: ");
            target = sc.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;
        int mid;
        boolean found = false;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println(target + " Found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println(target + " Not found in the array");
        }
    }
}
