class A3 {
    public boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false; // violation found
            }
        }
        return true; // no violation, so array is sorted
    }

    public static void main(String[] args) {
        A3 obj = new A3();

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 1, 4, 5};
        int[] nums3 = {1, 9, 6, 8, 5, 4, 0};

        System.out.println(obj.isSorted(nums1)); // Output: true
        System.out.println(obj.isSorted(nums2)); // Output: false
        System.out.println(obj.isSorted(nums3)); // Output: false
    }
}
