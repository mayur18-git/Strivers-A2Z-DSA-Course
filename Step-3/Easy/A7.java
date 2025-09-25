class A7 {
    public void moveZerosToEnd(int[] nums) {
        int n = nums.length, index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while (index < n) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        A7 obj = new A7();
        int[] nums1 = {0, 1, 4, 0, 5, 2};
        int[] nums2 = {0, 0, 0, 1, 3, -2};
        int[] nums3 = {0, 20, 0, -20, 0, 20};

        obj.moveZerosToEnd(nums1);
        obj.moveZerosToEnd(nums2);
        obj.moveZerosToEnd(nums3);

        for (int n : nums1) System.out.print(n + " ");
        System.out.println();
        for (int n : nums2) System.out.print(n + " ");
        System.out.println();
        for (int n : nums3) System.out.print(n + " ");
        System.out.println();
    }
}
