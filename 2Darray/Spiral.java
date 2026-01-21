import java.util.*;
public class Spiral {
    public static void printSpiral(int matrix[][])
    {
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        int startRow = 0;
        int endRow = matrix.length - 1;
        while (startCol <=  endCol && startRow <= endRow)
    {
        // top (left to ringht)
        for (int i = startCol; i <= endCol; i++)
            {
                System.out.print(matrix[startRow][i] + " ");
            }
        // right (top to down)
        for (int i = startRow + 1; i <= endRow; i++)
            {
                System.out.print(matrix[i][endCol] +" ");
            }
        // down (left to right)
        for (int i = endCol - 1; i >= startCol; i--)
            {
                if (endRow == startRow)
                    {
                        break;
                    }
                System.out.print(matrix[endRow][i] +" ");
            }
        for (int i = endRow - 1; i > startRow; i--)
            {
                if (endCol == startCol)
                    {
                        break;
                    }
                    System.out.print(matrix[i][startCol] +" ");
            }
            endCol--;
            endRow--;
            startCol++;
            startRow++;
    }
    System.out.println();
}
    public static void main(String args[])
    {
        System.out.print("Enter no of Rows: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Enter no of Columns: ");
        int m = scanner.nextInt();
        int Matrix[][] = new int[n][m];
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                    {
                        Matrix[i][j] = scanner.nextInt();
                    }
            }
        printSpiral(Matrix);
    }
}
