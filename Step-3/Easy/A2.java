class A2 {
    public int secondLargestElement(int[] nums) {
        if (nums.length < 2) return -1; // not enough elements

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                // update both largest and secondLargest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                // update only secondLargest
                secondLargest = num;
            }
        }

        // if no second largest found, return -1
        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        A2 obj = new A2();

        int[] nums1 = {8, 8, 7, 6, 5};
        int[] nums2 = {10, 10, 10, 10, 10};
        int[] nums3 = {7, 7, 2, 2, 10, 10, 10};

        System.out.println(obj.secondLargestElement(nums1)); // Output: 7
        System.out.println(obj.secondLargestElement(nums2)); // Output: -1
        System.out.println(obj.secondLargestElement(nums3)); // Output: 7
    }
}
