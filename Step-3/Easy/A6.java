class A6 {
    public void rotateArrayByK(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k % n == 0) return;
        k = k % n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        A6 obj = new A6();
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {3, 4, 1, 5, 3, -5};
        int[] nums3 = {1, 2, 3, 4, 5};

        obj.rotateArrayByK(nums1, 2);
        obj.rotateArrayByK(nums2, 8);
        obj.rotateArrayByK(nums3, 4);

        for (int n : nums1) System.out.print(n + " ");
        System.out.println();
        for (int n : nums2) System.out.print(n + " ");
        System.out.println();
        for (int n : nums3) System.out.print(n + " ");
        System.out.println();
    }
}
