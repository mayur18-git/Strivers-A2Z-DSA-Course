class A12 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        A12 obj = new A12();
        int[] nums = {1, 2, 2, 4, 3, 1, 4};
        System.out.println(obj.singleNumber(nums));
    }
}
