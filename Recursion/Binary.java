

public class Binary {
    public static void main(String args[])
    {
        int n = 3;
        Binary(new String(), 3, 0);
    }

    public static void Binary(String sb, int n, int lastdigit)
    {
        //recursion
        if (n == 0)
            {
                System.out.println(sb);
                return;
            }
        //recursion
        Binary(sb + "0", n - 1, 0);
        if(lastdigit == 0)
            {
                Binary(sb + "1", n - 1, 1);
            }
    }
}
