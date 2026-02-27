public class tiles{
    public static void main(String args[])
    {
        int n = 3;
        System.out.println("no of ways: " + tiles_req(n));
    }

    public static int tiles_req(int n)
    {
        if (n == 0 || n == 1)
            {
                return 1;
            }
        //horizontal (n - 2)
        // vertical (n - 1)

        return tiles_req(n - 1) + tiles_req(n - 2);

    }
}