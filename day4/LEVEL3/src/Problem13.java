import java.util.*;
class MatrixOperations {
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values between 0 and 9
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse does not exist (determinant is 0).");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void displayDoubleMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for Matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix 1: ");
        int cols1 = scanner.nextInt();
        System.out.print("Enter number of rows for Matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix 2: ");
        int cols2 = scanner.nextInt();

        int[][] matrix1 = createRandomMatrix(rows1, cols1);
        int[][] matrix2 = createRandomMatrix(rows2, cols2);

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        if (rows1 == rows2 && cols1 == cols2) {
            int[][] sum = addMatrices(matrix1, matrix2);
            System.out.println("\nSum of Matrices:");
            displayMatrix(sum);
        } else {
            System.out.println("\nMatrices cannot be added (dimensions do not match).");
        }

        if (rows1 == rows2 && cols1 == cols2) {
            int[][] difference = subtractMatrices(matrix1, matrix2);
            System.out.println("\nDifference of Matrices:");
            displayMatrix(difference);
        } else {
            System.out.println("\nMatrices cannot be subtracted (dimensions do not match).");
        }

        if (cols1 == rows2) {
            int[][] product = multiplyMatrices(matrix1, matrix2);
            System.out.println("\nProduct of Matrices:");
            displayMatrix(product);
        } else {
            System.out.println("\nMatrices cannot be multiplied (columns of Matrix 1 != rows of Matrix 2).");
        }

        System.out.println("\nTranspose of Matrix 1:");
        int[][] transpose1 = transposeMatrix(matrix1);
        displayMatrix(transpose1);

        System.out.println("\nTranspose of Matrix 2:");
        int[][] transpose2 = transposeMatrix(matrix2);
        displayMatrix(transpose2);

        if (rows1 == cols1 && (rows1 == 2 || rows1 == 3)) {
            if (rows1 == 2) {
                System.out.println("\nDeterminant of Matrix 1 (2x2): " + determinant2x2(matrix1));
            } else {
                System.out.println("\nDeterminant of Matrix 1 (3x3): " + determinant3x3(matrix1));
            }
        } else {
            System.out.println("\nDeterminant can only be calculated for 2x2 or 3x3 matrices.");
        }

        if (rows1 == cols1 && rows1 == 2) {
            double[][] inverse = inverse2x2(matrix1);
            if (inverse != null) {
                System.out.println("\nInverse of Matrix 1 (2x2):");
                displayDoubleMatrix(inverse);
            }
        } else {
            System.out.println("\nInverse can only be calculated for 2x2 matrices.");
        }
    }
}