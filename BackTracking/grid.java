public class grid
{
    public static void main(String[] args)
    {
        System.out.println(Total_paths(0, 0, 3, 3));
    }

    public static int Total_paths(int start_row, int start_col, int row, int col)
    {
        //base 
        // if get destination
        if ((start_row == row - 1) && (start_col == col - 1))
            {
                return 1;
            }
        //if at boundary and out of solN
        else if (start_row == row || start_col == col)
            {
                return 0;
            }

        //recursion
        return Total_paths(start_row, start_col + 1, row, col) + Total_paths(start_row + 1, start_col, row, col);
    }
}