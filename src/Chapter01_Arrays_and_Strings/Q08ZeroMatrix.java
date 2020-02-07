package Chapter01_Arrays_and_Strings;

/**
 * Problem: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
public class Q08ZeroMatrix {
    
    /**
     * Zero out matrix if matrix[i][j] is 0, zero out the row and column
     *
     * @param matrix the matrix to zero out
     */
    private void setZeros(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];
        
        // Store the row and column index with value 0
        for(int i = 0, length1 = matrix.length; i < length1; i++) {
            for(int j = 0, length2 = matrix[i].length; j < length2; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }
        
        // Zero out the rows
        for(int i = 0, length = rows.length; i < length; i++) {
            if(rows[i]) {
                zeroRow(matrix, i);
            }
        }
        
        // Zero out the columns
        for(int j = 0, length = columns.length; j < length; j++) {
            if(columns[j]) {
                zeroColumn(matrix, j);
            }
        }
    }
    
    /**
     * Zero out the row 'row'
     *
     * @param matrix the matrix to zero out
     * @param row    the row to zero out
     */
    private void zeroRow(int[][] matrix, int row) {
        for(int j = 0, length = matrix[0].length; j < length; j++) {
            matrix[row][j] = 0;
        }
    }
    
    /**
     * Zero out the column 'col'
     *
     * @param matrix the matrix to zero out
     * @param col    the column to zero out
     */
    private void zeroColumn(int[][] matrix, int col) {
        for(int i = 0, length = matrix.length; i < length; i++) {
            matrix[i][col] = 0;
        }
    }
    
    /**
     * Print out the matrix
     *
     * @param matrix the matrix to print out
     */
    private void printMatrix(int[][] matrix) {
        for(int[] ints : matrix) {
            for(int anInt : ints) {
                System.out.print(anInt + " ");
            }
            
            System.out.println();
        }
    }
    
    /**
     * Entry point for this program.
     *
     * @param args String arguments
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 0},
                {7, 8, 9}
        };
        
        Q08ZeroMatrix q08ZeroMatrix = new Q08ZeroMatrix();
        
        q08ZeroMatrix.printMatrix(matrix);
        
        q08ZeroMatrix.setZeros(matrix);
        System.out.println();
        
        q08ZeroMatrix.printMatrix(matrix);
    }
}
