import java.util.ArrayList;

class A9 {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int i = 0, j = 0;
        ArrayList<Integer> unionList = new ArrayList<>();
        
        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i])
                    unionList.add(nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums2[j])
                    unionList.add(nums2[j]);
                j++;
            } else {
                if (unionList.isEmpty() || unionList.get(unionList.size() - 1) != nums1[i])
                    unionList.add(nums1[i]);
                i++;
                j++;
            }
        }
        while (i < n1) {
            if (unionList.get(unionList.size() - 1) != nums1[i])
                unionList.add(nums1[i]);
            i++;
        }
        while (j < n2) {
            if (unionList.get(unionList.size() - 1) != nums2[j])
                unionList.add(nums2[j]);
            j++;
        }

        int[] result = new int[unionList.size()];
        for (int k = 0; k < unionList.size(); k++) result[k] = unionList.get(k);
        return result;
    }

    public static void main(String[] args) {
        A9 obj = new A9();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        int[] result = obj.unionArray(nums1, nums2);
        for (int n : result) System.out.print(n + " ");
        System.out.println();
    }
}
