public class substring {
    public static String subString(String str, int start, int end)
    {
        String sub = "";
        for (int i = start; i < end; i++)
            {
                sub += str.charAt(i);
            }
        return sub;
    }
    public static void main(String args[])
    {
        String name  = "Chahal";
        // System.out.println(name.substring(0, 5));
        System.out.println(subString(name, 0, 3));

    }
}
