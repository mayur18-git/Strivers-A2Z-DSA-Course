class A20 {
    public int stockBuySell(int[] arr, int n) {
        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else {
                maxProfit = Math.max(maxProfit, arr[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        A20 sol = new A20();

        int[] arr1 = {10, 7, 5, 8, 11, 9};
        System.out.println(sol.stockBuySell(arr1, arr1.length)); // Output: 6

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(sol.stockBuySell(arr2, arr2.length)); // Output: 0

        int[] arr3 = {3, 8, 1, 4, 6, 2};
        System.out.println(sol.stockBuySell(arr3, arr3.length)); // Output: 7
    }
}
