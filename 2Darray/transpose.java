import java.util.*;
public class transpose {
    public static int[][] transpose(int matrix[][])
    {
        
        int col = matrix.length;
        int row = matrix[0].length;
        int transpose[][] = new int[row][col];
        
        for (int i = 0; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[0].length; j++)
                    {
                        transpose[j][i] = matrix[i][j];
                        
                    }
                
            }
            return transpose;
    }

    public static void main(String args[])
    {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6}};
        int result[][] = transpose(matrix);
        System.out.println(Arrays.deepToString(result));
    }
}
