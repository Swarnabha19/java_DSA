
import java.util.*;

class lcm {

    public static void main(String[] args) {
        System.out.println("enter 2 numbers:");
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        int max = a > b ? b : a;

        int lcm = 0;
        for (int i = max; i <= a * b; i++) {
            if ((i % a == 0) && (i % b == 0)) {
                lcm = i;
                break;
            }
        }
        System.out.print("hcf  of " + a + " and " + b + " is: " + lcm);
    }
}
