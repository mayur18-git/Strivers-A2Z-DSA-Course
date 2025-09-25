class A11 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                if (count > maxCount) maxCount = count;
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        A11 obj = new A11();
        int[] nums1 = {1, 1, 0, 0, 1, 1, 1, 0};
        int[] nums2 = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] nums3 = {1, 0, 1, 1, 1, 0, 1, 1, 1};

        System.out.println(obj.findMaxConsecutiveOnes(nums1));
        System.out.println(obj.findMaxConsecutiveOnes(nums2));
        System.out.println(obj.findMaxConsecutiveOnes(nums3));
    }
}
