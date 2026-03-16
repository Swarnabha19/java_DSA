
import java.util.*;

public class friendly_pair {

    public static int getDivisorSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        int sum1 = getDivisorSum(num1);
        int sum2 = getDivisorSum(num2);
        System.out.println("sum of divisors of " + num1 + ": " + sum1);
        System.out.println("ratio of sum of divisors and number for" + num1 + ": " + (double)sum1 / num1);

        System.out.println("sum of divisors of " + num2 + ": " + sum2);
        System.out.println("ratio of sum of divisors and number for" + num2 + ": " + (double)sum2 / num2);

        if (sum1 * num2 == sum2 * num1) {
            System.out.println(num1 + " and " + num2 + " are friendly pair");
        } else {
            System.out.println(num1 + " and " + num2 + " are not friendly pair");
        }

    }
}
