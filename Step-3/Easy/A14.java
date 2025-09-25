import java.util.*;

class A14 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // should not reach here as per constraints
    }

    public static void main(String[] args) {
        A14 obj = new A14();
        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;
        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
