class A4 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        A4 obj = new A4();
        int[] nums1 = {0, 0, 3, 3, 5, 6};
        int[] nums2 = {-2, 2, 4, 4, 4, 4, 5, 5};
        int[] nums3 = {-30, -30, 0, 0, 10, 20, 30, 30};

        System.out.println(obj.removeDuplicates(nums1));
        System.out.println(obj.removeDuplicates(nums2));
        System.out.println(obj.removeDuplicates(nums3));
    }
}
