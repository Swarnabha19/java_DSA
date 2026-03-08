
import java.util.*;

class freq_easy {

    public static void main(String args[]) {
        //String st = "swarnabha";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String st = sc.nextLine();
        st = st.trim();
        st = st.toLowerCase();
        st=st.replace(" ","");
        System.out.println(st);
        int freq[] = new int[256];
        int n = st.length();
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            char c = st.charAt(i);
            freq[c]++;
        }
        System.out.println("the unique characters are:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.print((char) i + " ");
                System.out.println((char) i + ":" + freq[i]);
            }
        }
        int f = 0;
        for (int i = 0; i < n; i++) {
            if (freq[st.charAt(i)] == 1) {
                System.out.println("the first non repeting character is:" + st.charAt(i));
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.println("all characters are repeated");
        }

    }
}
