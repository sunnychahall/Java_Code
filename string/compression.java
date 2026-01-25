public class compression
{
    public static String compression(String str)
    {
        String s = "";
        for (int i = 0; i < str.length(); i++)
            {
                int count = 1;
                
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1) )
                    {
                        count++;
                        i++;
                    }
                    s += (str.charAt(i));
                    if (count > 1)
                        {
                            s += count;
                        }
                    
            }
        return s;
    }
    public static void main(String args[])
    {
        String str = "aaabbcccddddbb";
        System.out.println(compression(str));
    }
}