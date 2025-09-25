class A25 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) firstColZero = true;
        }
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) firstRowZero = true;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }
        if (firstColZero) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        A25 sol = new A25();

        int[][] matrix1 = {{1,1,1},{1,0,1},{1,1,1}};
        sol.setZeroes(matrix1);
        printMatrix(matrix1);

        int[][] matrix2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        sol.setZeroes(matrix2);
        printMatrix(matrix2);

        int[][] matrix3 = {{1,2,3,4},{5,6,0,8},{9,10,11,12}};
        sol.setZeroes(matrix3);
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
