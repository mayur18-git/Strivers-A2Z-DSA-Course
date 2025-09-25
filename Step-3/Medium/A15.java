import java.util.*;

class A15 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int[] result = {map.get(complement), i};
                Arrays.sort(result); // ensure increasing order
                return result;
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // just in case
    }

    public static void main(String[] args) {
        A15 obj = new A15();
        int[] nums = {1, 6, 2, 10, 3};
        int target = 7;
        int[] res = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
