//the sum of factorial of digits of a number= number=strong no

import java.util.*;

class strong_no {

    public static void main(String[] args) {
        System.out.println("enter no:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int fact;
        int x = n;
        while (x > 0) {
            fact = 1;
            int rem = x % 10;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            x = x / 10;
        }
        if (sum == n) {
            System.out.println(n + ":Strong number");
        } else {
            System.out.println(n + ": not Strong number:n= " + n + " sum= " + sum);
        }
    }
}
