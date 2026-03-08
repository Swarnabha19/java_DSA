// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class co_prime {

    public static void main(String[] args) {
        System.out.println("enter 2 nos:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        x = Math.abs(x);
        y = Math.abs(y);
        if (x == 0 && y == 0) {
            System.out.println("undefined");
            System.exit(0);
        }
        if (x == 0 || y == 0) {
            int gcd = x == 0 ? y : x;
            System.out.println("co prime:" + gcd);
            System.exit(0);
        }
        int min = x > y ? y : x;
        int hcf = 0;
        for (int i = 1; i <= min; i++) {
            if ((x % i == 0) && (y % i == 0)) {
                hcf = i;
            }
        }
        if (hcf == 1) {
            System.out.println(x + " and " + y + " are coprime");
        } else {
            System.out.println(x + " and " + y + " are not coprime hcf:" + hcf);
        }
    }
}
