package hw2;

public class cccc {

	public static void main(String[] args) {
        int[][] mat1 = {{1, 0, 0}, {0, 1, 0}};
        int[][] mat2 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] result = multiply(mat1, mat2);
        printMatrix(result);
    }
 
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int m1 = mat1.length;
        int n1 = mat1[0].length;
        int m2 = mat2.length;
        int n2 = mat2[0].length;
        if (n1 != m2) {
            throw new RuntimeException("Invalid matrix");
        }
        int[][] result = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                for (int k = 0; k < n1; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        return result;
    }
 
    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
