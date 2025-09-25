class A21 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        A21 sol = new A21();

        int[] nums1 = {2, 4, 5, -1, -3, -4};
        int[] res1 = sol.rearrangeArray(nums1);
        for (int val : res1) System.out.print(val + " ");
        System.out.println();

        int[] nums2 = {1, -1, -3, -4, 2, 3};
        int[] res2 = sol.rearrangeArray(nums2);
        for (int val : res2) System.out.print(val + " ");
        System.out.println();

        int[] nums3 = {-4, 4, -4, 4, -4, 4};
        int[] res3 = sol.rearrangeArray(nums3);
        for (int val : res3) System.out.print(val + " ");
        System.out.println();
    }
}
