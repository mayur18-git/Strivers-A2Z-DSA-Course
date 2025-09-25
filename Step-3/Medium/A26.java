class A26 {
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        A26 sol = new A26();

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        sol.rotateMatrix(matrix1);
        printMatrix(matrix1);

        int[][] matrix2 = {{0,1,1,2},{2,0,3,1},{4,5,0,5},{5,6,7,0}};
        sol.rotateMatrix(matrix2);
        printMatrix(matrix2);

        int[][] matrix3 = {{1,1,2},{5,3,1},{5,3,5}};
        sol.rotateMatrix(matrix3);
        printMatrix(matrix3);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }
}
