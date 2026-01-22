import java.util.*;
public class Count {
    public static int countNum(int matrix[][], int n)
    {
        int count = 0;
        for (int i = 0; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[0].length; j++)
                    {
                        if (matrix[i][j] == n)
                            {
                                count++;
                            }
                                          
                        }
                
            }
            return count;
    }

    public static void main(String args[])
    {
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner .nextInt();
        
        System.out.println(countNum(matrix, n));
    }
}
