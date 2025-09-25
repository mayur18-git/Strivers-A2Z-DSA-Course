class A5 {
    public void rotateArrayByOne(int[] nums) {
        if (nums.length <= 1) return;
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {
        A5 obj = new A5();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {-1, 0, 3, 6};
        int[] nums3 = {7, 6, 5, 4};

        obj.rotateArrayByOne(nums1);
        obj.rotateArrayByOne(nums2);
        obj.rotateArrayByOne(nums3);

        for (int n : nums1) System.out.print(n + " ");
        System.out.println();
        for (int n : nums2) System.out.print(n + " ");
        System.out.println();
        for (int n : nums3) System.out.print(n + " ");
        System.out.println();
    }
}
