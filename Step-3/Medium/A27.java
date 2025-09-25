import java.util.*;

class A27 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) result.add(matrix[top][j]);
            top++;

            for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) result.add(matrix[bottom][j]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        A27 sol = new A27();

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sol.spiralOrder(matrix1)); // [1, 2, 3, 6, 9, 8, 7, 4, 5]

        int[][] matrix2 = {{1,2,3,4},{5,6,7,8}};
        System.out.println(sol.spiralOrder(matrix2)); // [1, 2, 3, 4, 8, 7, 6, 5]

        int[][] matrix3 = {{1,2},{3,4},{5,6},{7,8}};
        System.out.println(sol.spiralOrder(matrix3)); // [1, 2, 4, 6, 8, 7, 5, 3]
    }
}
