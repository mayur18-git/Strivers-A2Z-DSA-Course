class A1 {
    public int largestElement(int[] nums) {
        // assume the first element is the largest
        int max = nums[0];

        // loop through the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];  // update max if a bigger element is found
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Example test
        int[] nums1 = {3, 3, 6, 1};
        int[] nums2 = {3, 3, 0, 99, -40};
        int[] nums3 = {-4, -3, 0, 1, -8};

        A1 obj = new A1();

        System.out.println(obj.largestElement(nums1)); // Output: 6
        System.out.println(obj.largestElement(nums2)); // Output: 99
        System.out.println(obj.largestElement(nums3)); // Output: 1
    }
}
