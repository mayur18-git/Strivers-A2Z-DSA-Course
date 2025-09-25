class A17 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        A17 obj = new A17();
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(obj.majorityElement(nums)); // Output: 7
    }
}
