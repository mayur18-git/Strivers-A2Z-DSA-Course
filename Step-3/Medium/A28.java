import java.util.*;

class A28 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            if (prefixSum.containsKey(sum - k)) {
                count += prefixSum.get(sum - k);
            }
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        A28 sol = new A28();

        int[] nums1 = {1, 1, 1};
        System.out.println(sol.subarraySum(nums1, 2)); // Output: 2

        int[] nums2 = {1, 2, 3};
        System.out.println(sol.subarraySum(nums2, 3)); // Output: 2

        int[] nums3 = {3, 1, 2, 4};
        System.out.println(sol.subarraySum(nums3, 6)); // Output: 1
    }
}
