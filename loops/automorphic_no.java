//last digit of the no and the sq of that no must be same

import java.util.*;

class automorphic_no {

    public static void main(String[] args) {
        System.out.println("enter no:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = a % 10;

        int b = a * a;
        System.out.println("square of " + a + " is " + b);
        int y = b % 10;
        if (x == y) {
            System.out.println(a + " is an automorphic number");
        } else {
            System.out.println(a + " is not an automorphic no");
        }
    }
}
