import java.util.*;

class A33 {
    public int subarraysWithXorK(int[] nums, int k) {
        Map<Integer, Integer> xorCount = new HashMap<>();
        int count = 0, xor = 0;

        for (int num : nums) {
            xor ^= num;

            if (xor == k) count++;

            if (xorCount.containsKey(xor ^ k)) {
                count += xorCount.get(xor ^ k);
            }

            xorCount.put(xor, xorCount.getOrDefault(xor, 0) + 1);
        }

        return count;
    }
}
