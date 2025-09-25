class A8 {
    public int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        A8 obj = new A8();
        int[] nums1 = {2, 3, 4, 5, 3};
        int[] nums2 = {2, -4, 4, 0, 10};
        int[] nums3 = {1, 3, 5, -4, 1};

        System.out.println(obj.linearSearch(nums1, 3));  // Output: 1
        System.out.println(obj.linearSearch(nums2, 6));  // Output: -1
        System.out.println(obj.linearSearch(nums3, 1));  // Output: 0
    }
}
