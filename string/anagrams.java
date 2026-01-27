
import java.util.Arrays;

public class anagrams
{
    public static boolean isAnagrams(String str, String str1)
    {
        if (str.length() == str1.length())
            {
        char[] ch1 = str.toCharArray();
        char[] ch2 = str1.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
            if (Arrays.equals(ch1, ch2))
                {
                    return true;
                }
            else
                {
                return false;
            }
            }
        return false;
        
    }
    public static void main(String args[])
    {
        String input1 = "race";
        String input2 = "care";
        System.out.println(isAnagrams(input1, input2));
    }
}