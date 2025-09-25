import java.util.*;

class A13 {
    public int longestSubarraySumK(int[] nums, int k) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (!sumIndexMap.containsKey(sum)) {
                sumIndexMap.put(sum, i);
            }

            if (sumIndexMap.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum - k));
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        A13 obj = new A13();
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(obj.longestSubarraySumK(nums, k));
    }
}
