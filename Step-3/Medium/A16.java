class A16 {
    public void sortZeroOneTwo(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0 -> {
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }
    }

    public static void main(String[] args) {
        A16 obj = new A16();
        int[] nums = {1, 0, 2, 1, 0};
        obj.sortZeroOneTwo(nums);
        for (int n : nums) System.out.print(n + " ");
    }
}
