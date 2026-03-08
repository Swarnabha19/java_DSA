
import java.util.*;

public class duplicate_unsorted {

    public static void duplicate(int a[], int n) {
        boolean[] visited = new boolean[n];
        int[] a2 = new int[n];
        int totalDuplicates = 0;
        int unique = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println("frequency of " + a[i] + " : " + count);
            if (count > 1) {
                totalDuplicates = (count - 1) + totalDuplicates;
                // System.out.println("duplates of " + a[i] + " is: " + totalDuplicates); // count - 1 = number of duplicates for that element
            }
            a2[unique] = a[i];
            unique++;
        }
        System.out.println("total duplicates/ the minimum number of elements to be removed are :" + totalDuplicates);

        System.out.println("the unique elements are:");
        for (int i = 0; i < unique; i++) {
            System.out.print(a2[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        n = obj.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "]:");
            a[i] = obj.nextInt();

        }
        duplicate(a, n);
    }
}
