
//sum of digits of a no divides the no completely
import java.util.*;

class harshad {

    public static void main(String[] args) {
        System.out.println("enter no:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = a;
        int k = 0;
        while (n > 0) {
            int rem = n % 10;
            k = k + rem;
            n = n / 10;
        }
        if (a % k == 0) {
            System.out.println(a + " is a harshad no.");
        } else {
            System.out.println(a + " is a  not harshad no.");
        }
    }
}
