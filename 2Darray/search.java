import java.util.*;

public class search {
    public static boolean Search(int matrix[][], int key)
    {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col <= matrix[0].length - 1)
            {
                if (key == matrix[row][col])
                    {
                        System.out.println("Key found at index : " + row +", " + col);
                        return true;
                    }
                else if (key < matrix[row][col])
                    {
                        row--;
                    }
                else 
                    {
                        col++;
                    }
                }
                System.out.println("Key not found");
                return false;
            }
            public static void main(String args[])
            {
                int matrix[][] = {{1, 2, 3},
                                   {4, 8, 9}};
                System.out.print("Enter Value: ");
                Scanner scanner = new Scanner(System.in);
                int value = scanner.nextInt();
                Search(matrix, value);
            }
    }

