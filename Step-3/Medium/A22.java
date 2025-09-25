class A22 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        A22 sol = new A22();

        int[] nums1 = {1, 2, 3};
        sol.nextPermutation(nums1);
        for (int val : nums1) System.out.print(val + " ");
        System.out.println();

        int[] nums2 = {3, 2, 1};
        sol.nextPermutation(nums2);
        for (int val : nums2) System.out.print(val + " ");
        System.out.println();

        int[] nums3 = {1, 1, 5};
        sol.nextPermutation(nums3);
        for (int val : nums3) System.out.print(val + " ");
        System.out.println();
    }
}
