public class TransposeOfMatrix{
    public static void main(String[] args) {
        int rows=2, cols=3;
        int [][] matrix= {{1, 2, 3}, {4, 5, 6}};

            System.out.println("The original matrix");
            printMatrix(matrix);

         int [][] transpose = new int[cols][rows];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
             transpose[j][i] = matrix[i][j];
            }
        
        }
         System.out.println("Transpose of Matrix:");
        printMatrix(transpose);
       
    }
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is : ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        
    }
}