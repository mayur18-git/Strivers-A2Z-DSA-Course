class A10 {
    public int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : nums) arraySum += num;
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        A10 obj = new A10();
        int[] nums1 = {0, 2, 3, 1, 4};
        int[] nums2 = {0, 1, 2, 4, 5, 6};
        int[] nums3 = {1, 3, 6, 4, 2, 5};

        System.out.println(obj.findMissingNumber(nums1));
        System.out.println(obj.findMissingNumber(nums2));
        System.out.println(obj.findMissingNumber(nums3));
    }
}
