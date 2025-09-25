import java.util.*;

class A24 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int longest = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        A24 sol = new A24();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println(sol.longestConsecutive(nums1)); // Output: 4

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(sol.longestConsecutive(nums2)); // Output: 9

        int[] nums3 = {1, 9, 3, 10, 4, 20, 2};
        System.out.println(sol.longestConsecutive(nums3)); // Output: 4
    }
}
