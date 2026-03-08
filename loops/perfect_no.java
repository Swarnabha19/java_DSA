
import java.util.*;

/**
 * Write a description of class factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class perfect_no {

    public static void main(String arg[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter range:");
        int n = obj.nextInt();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }

            }
            if (i == sum) {
                System.out.println(i);
            }
        }

    }
}
