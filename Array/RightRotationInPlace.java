import java.util.Arrays;
import java.util.Scanner;

public class RightRotationInPlace {
    
    // Function to reverse a subarray from index start to end
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate array to the right by d positions
    static void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;  // Handle cases where d > n

        // Step 1: Reverse whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first d elements
        reverse(arr, 0, d - 1);

        // Step 3: Reverse remaining n - d elements
        reverse(arr, d, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter rotation count (d): ");
        int d = sc.nextInt();

        rotate(arr, d);

        System.out.println("Rotated array: " + Arrays.toString(arr));
        sc.close();
    }
}
