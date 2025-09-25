class A18 {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        A18 sol = new A18();

        int[] nums1 = {2, 3, 5, -2, 7, -4};
        System.out.println(sol.maxSubArray(nums1)); // Output: 15

        int[] nums2 = {-2, -3, -7, -2, -10, -4};
        System.out.println(sol.maxSubArray(nums2)); // Output: -2

        int[] nums3 = {-1, 2, 3, -1, 2, -6, 5};
        System.out.println(sol.maxSubArray(nums3)); // Output: 7
    }
}
