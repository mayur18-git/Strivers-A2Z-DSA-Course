import java.util.*;

class A32 {
    public int maxLen(int[] arr) {
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        int maxLen = 0, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            } else if (sumIndexMap.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
            } else {
                sumIndexMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
