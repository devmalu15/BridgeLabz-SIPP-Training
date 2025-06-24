package Methods;
import java.util.Random;

public class Question26 {

    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }
        return matrix;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1)
            return matrix[0][0];
        if (n == 2)
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double det = 0;
        for (int p = 0; p < n; p++) {
            double[][] subMatrix = new double[n - 1][n - 1];
            for (int i = 1; i < n; i++) {
                int colCount = 0;
                for (int j = 0; j < n; j++) {
                    if (j == p)
                        continue;
                    subMatrix[i - 1][colCount++] = matrix[i][j];
                }
            }
            det += matrix[0][p] * Math.pow(-1, p) * determinant(subMatrix);
        }
        return det;
    }

    public static double[][] inverseMatrix(double[][] matrix) {
        int n = matrix.length;
        double det = determinant(matrix);
        if (det == 0)
            return null;

        double[][] adjoint = new double[n][n];
        double[][] cofactor = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double[][] minor = new double[n - 1][n - 1];
                int row = 0;
                for (int r = 0; r < n; r++) {
                    if (r == i)
                        continue;
                    int col = 0;
                    for (int c = 0; c < n; c++) {
                        if (c == j)
                            continue;
                        minor[row][col++] = matrix[r][c];
                    }
                    row++;
                }
                cofactor[i][j] = Math.pow(-1, i + j) * determinant(minor);
            }
        }

        adjoint = transposeMatrix(cofactor);
        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = adjoint[i][j] / det;
            }
        }
        return inverse;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 3;
        double[][] matrix = createRandomMatrix(size, size);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose of Matrix:");
        printMatrix(transposeMatrix(matrix));

        double det = determinant(matrix);
        System.out.println("\nDeterminant: " + det);

        double[][] inverse = inverseMatrix(matrix);
        if (inverse == null) {
            System.out.println("\nInverse: Not possible (Determinant is zero)");
        } else {
            System.out.println("\nInverse of Matrix:");
            printMatrix(inverse);
        }
    }
}
