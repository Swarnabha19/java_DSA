
import java.util.*;

class hcf_euclidean {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = Math.abs(a);
        int y = Math.abs(b);

        // Euclidean Algorithm for HCF
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;

        // LCM formula
        int lcm = (Math.abs(a * b)) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}
