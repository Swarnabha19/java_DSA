
import java.util.*;

class Plus_one {

    public static int[] addOne(int digit[]) {
        int n = digit.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digit[i] < 9) {
                digit[i]++;
                return digit;
            } else {
                digit[i] = 0;
            }
        }
        int res[] = new int[digit.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String args[]) {
        int digit[] = {9, 9, 9};
        int ans[] = addOne(digit);
        for (int i = 0; i < ans.length; i++) {
            int x;
            x = ans[i];
            System.out.print(x);
        }
        System.out.println("");
        System.out.println("the new array is:" + Arrays.toString(ans));

    }
}
