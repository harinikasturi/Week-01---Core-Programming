import java.util.Scanner;

class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();

            if (rows <= 0 || columns <= 0) {
                System.out.println("Error: Rows and columns must be greater than zero.");
                return;
            }

            int[][] matrix = new int[rows][columns];
            int[] array = new int[rows * columns];
            int index = 0;

            System.out.println("Enter the elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                    array[index++] = matrix[i][j];
                }
            }

            System.out.println("\nMatrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\n1D Array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        
        }
    }


