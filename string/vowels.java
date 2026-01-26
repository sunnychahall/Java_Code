
import java.util.Scanner;

public class vowels
{
    public static int countVowel(String input)
    {
        int count = 0;
        for (int i = 0; i < input.length(); i++)
            {
                char c = input.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u')
                    {
                        count++;
                    }
            }
        return count;
    }
    public static void main(String args[])
    {
        System.out.print("Enter input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countVowel(input));
    }
}