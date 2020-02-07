package Chapter01_Arrays_and_Strings;

/**
 * Problem:Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to
 * rotate the image by 90 degrees. Can you do this in place?
 */
public class Q07RotateMatrix {
    
    
    private void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return;
        }
        
        for(int layer = 0, length = matrix.length; layer < length; layer++) {
            int left = layer;
            int right = length - 1 - layer;
            for(int i = left; i < right; i++){
                int top = matrix[left][i];
                int offset = i - left;
                
                // Left -> top
                matrix[left][i] = matrix[right - offset][left];
    
                // Bottom -> left
                matrix[right-offset][left] = matrix[right][right - offset];
    
                // Right -> bottom
                matrix[right][right - offset] = matrix[i][right];
    
                // Top -> right
                matrix[i][right] = top;
            }
        }
    
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
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
        Q07RotateMatrix q07RotateMatrix = new Q07RotateMatrix();
        
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        q07RotateMatrix.rotate(matrix);
    }
}
