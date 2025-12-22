public class MatrixOperations {

    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); 
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int rows = 3, cols = 3;



        // Create random matrices
        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Addition
        System.out.println("\nAddition (A + B):");
        displayMatrix(addMatrices(matrixA, matrixB));

        // Subtraction
        System.out.println("\nSubtraction (A - B):");
        displayMatrix(subtractMatrices(matrixA, matrixB));

        // Multiplication
        System.out.println("\nMultiplication (A × B):");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
    }
}
