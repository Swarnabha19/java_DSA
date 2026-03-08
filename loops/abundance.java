
import java.util.*;

class abundance {

    public static void main(String[] args) {
        System.out.println("enter no:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        if (a < sum) {
            int abundance = sum - a;
            System.out.print("Abundunt:sum= " + sum + " abundance: " + abundance);
        } else {
            System.out.print(" not Abundunt: sum= " + sum);
        }
    }
}
