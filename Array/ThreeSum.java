
public class ThreeSum {

    public int[] threeSum(int[] nums) {
        int n = nums.length;
        int res[] = new int[3];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        res[0] = nums[i];
                        res[1] = nums[j];
                        res[2] = nums[k];

                        return res;
                    }
                }
            }
        }
        return new int[0];
    }

    public static void main(String args[]) {
        ThreeSum obj = new ThreeSum();
        int nums[] = {-1, 0, 1, 2, -1, -4};
        int res[] = obj.threeSum(nums);
        if (res.length == 0) {
            System.out.println("No triplet found");
        } else {
            System.out.println("Triplet found: " + res[0] + ", " + res[1] + ", " + res[2]);
        }
    }
}
