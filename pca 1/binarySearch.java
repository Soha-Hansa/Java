class binarySearch {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a sorted array followed by a target value.");
            return;
        }

        // Dynamically size the array based on inputs (all elements except the last one)
        int arr[] = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        // The very last argument is treated as the search target
        int target = Integer.parseInt(args[args.length - 1]);
        
        int left = 0; 
        int right = arr.length - 1; // Search within the array bounds
        int mid;
        boolean found = false;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println(target + " found at index " + mid);
                found = true;
                break; // Stop the loop once found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println(target + " not found in the array.");
        }
    }
}