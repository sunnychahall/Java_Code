public class nQueen{
    public static void main(String[] args)
    {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                    {
                        board[i][j] = 'X';
                    }
            }
        Queen(0, board);
    }

    public static void Queen(int row, char[][] board)
    {
        //base case 
        if (row == board.length)
            {
                print(board);
                return;
            }
        //recusion function
        for (int i = 0; i < board.length; i++)
            {
                if (is_safe(row, i, board))
                    {
                        board[row][i] = 'Q';
                        //recursion
                        Queen(row + 1, board);
                        //backtrack
                        board[row][i] = 'X';
                    }
                     
            }
    }

    public static void print(char[][] board)
    {
        for (int i = 0; i < board.length; i++)
            {
                for (int j = 0; j < board.length; j++)
                    {
                        System.out.print(board[i][j]);
                    }
                    System.out.println("");
            }
            System.out.println("_________________");
    }

    public static boolean is_safe(int row, int col, char[][] board)
    {
        //vertical up
        for (int i = row; i >= 0; i--)
            {
                if (board[i][col] == 'Q')
                    {
                        return false;
                    }
            }
        //digonal left
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            {
                if (board[i][j] == 'Q')
                    {
                        return false;
                    }
            }

        //diagonalright
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++)
            {
                if (board[i][j] == 'Q')
                    {
                        return false;
                    }
            }
    return true;
    }
}