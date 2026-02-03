import java.util.*;

public class IntersectionArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            boolean alreadyAdded = false;

            // check if nums1[i] is already added
            for (int k = 0; k < count; k++) {
                if (temp[k] == nums1[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded) continue;

            // check if nums1[i] exists in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    temp[count++] = nums1[i];
                    break;
                }
            }
        }

        // Copy result to a properly sized array
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {4, 9, 5};
        int[] a2 = {9, 4, 9, 8, 4};
        int[] res = intersection(a1, a2);

        System.out.println("The common elements are: " + Arrays.toString(res));
    }
}
