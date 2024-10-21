public class TwoDimensionalArray {

    private static int[][] generateMatrix(int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                matrix[i][j] = Math.max(13, (int) (Math.random() * 100));
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 5, col = 4;

        int[][] matrix = generateMatrix(row, col);
        printMatrix(matrix);
    }

}
