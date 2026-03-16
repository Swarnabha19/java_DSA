
import java.util.*;

public class twin_prime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a: ");
        int n = in.nextInt();
        System.out.print("enter b: ");
        int m = in.nextInt();

        if (n <= 1 || m <= 1) {
            System.out.println("inputs must be > 1");
            return;
        }
    
        int a = Math.min(n, m);
        int b = Math.max(n, m);

        if (b - a == 2 && isPrime(a) && isPrime(b)) {
            System.out.println(n + " and " + m + " are twin prime");
        } else {
            System.out.println(n + " and " + m + " are not twin prime");
        }
    }

    private static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        if (x % 2 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(x);
        for (int i = 3; i <= limit; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}


/* alt
if (n < 2 || m < 2) {
            System.out.println(n + " is neither prime nor composite");
            System.exit(1);
        }
        int max = m > n ? m : n;
        int min = m > n ? n : m;
        if (max - min == 2) {
            for (i = 2; i <= max / 2; i++) {
                if ((n % i == 0) || (m % i == 0)) {
                    f = 0;
                    break;
                }
            }
            if (f == 1) {
                System.out.println(n + " and " + m + " are twin prime"); 
            }else {
                System.out.println(n + " and " + m + " are not twin prime");
            }

        }
*/
