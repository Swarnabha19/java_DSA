
import java.util.Scanner;

public class no_of_duplicates {

    public static void duplicate(int a[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count = count + 1;
                    break;
                }
            }
        }
        System.out.println("the minimum number of elements to be removed are :" + count);
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
