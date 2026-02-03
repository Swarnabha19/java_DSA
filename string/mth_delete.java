import java.util.*;

public class mth_delete {

    public void delete(String str, int m) {
        int l = str.length();
        String s = str.substring(0, m - 1);
        String q = str.substring(m, l);

        s = s.concat(q);

        System.out.println("The string after deleting the m-th element from the string:" + s);

    }

    public static void main(String[] args) {

        String st;
        int el;
        Scanner sc = new Scanner(System.in);
        st = sc.next();
        el = sc.nextInt();
        mth_delete ob = new mth_delete();
        ob.delete(st, el);
    }
}
