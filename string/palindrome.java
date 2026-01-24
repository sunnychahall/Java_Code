import java.util.*;
public class palindrome{

    public static boolean isPalindrome(String name)
    {
        for (int i = 0; i < name.length() / 2; i++)
            {
                if (name.charAt(i) != name.charAt(name.length() - 1 - i))
                    {
                        System.out.println("Input is not a Palindrome :(");
                        return false;
                    }
            }
            System.out.println("Input is  a Palindrome :)");
            return true;
        }
    public static void main(String[] args) {
        System.out.print("Enter Input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        isPalindrome(input);
    }
}