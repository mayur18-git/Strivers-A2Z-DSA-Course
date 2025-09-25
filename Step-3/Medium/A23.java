import java.util.*;

class A23 {
    public List<Integer> leaders(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                result.add(nums[i]);
                maxFromRight = nums[i];
            }
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        A23 sol = new A23();

        int[] nums1 = {1, 2, 5, 3, 1, 2};
        System.out.println(sol.leaders(nums1)); // Output: [5, 3, 2]

        int[] nums2 = {-3, 4, 5, 1, -4, -5};
        System.out.println(sol.leaders(nums2)); // Output: [5, 1, -4, -5]

        int[] nums3 = {-3, 4, 5, 1, -30, -10};
        System.out.println(sol.leaders(nums3)); // Output: [5, 1, -10]
    }
}
