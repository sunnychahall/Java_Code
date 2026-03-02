public class length {
    public static void main(String args[])
    {
        String s = "Debug";
        System.out.println(length(s));

    }
    public static int length(String s)
    {
        //base
        if (s.length() == 0)
            {
                return 0;
            }

        //recursion
        return length(s.substring(1)) + 1;
    }
}
