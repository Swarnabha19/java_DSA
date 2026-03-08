
import java.util.HashMap;

public class frequency {

    public static HashMap<Integer, Integer> frequency(int a[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // if (map.containsKey(a[i])) 
            //{
            //     map.put(a[i], map.get(a[i]) + 1);
            // } else {
            //     map.put(a[i], 1);
            // }
            map.put(a[i], map.getOrDefault(a[i], 0) + 1); //one liner
        }
        return map;
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 2, 5, 1, 7, 5};
        int n = a.length;
        HashMap<Integer, Integer> result = frequency(a, n);
        System.out.println("frequency of elements in the array:" + result);
    }
}
