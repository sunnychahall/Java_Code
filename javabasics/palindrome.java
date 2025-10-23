
import java.util.*;

public class palindrome
{
    public static int rev(int n)
    {
        int rem;
        int rev = 0;
        int m = n;
        
        while (n > 0)
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
            
        }
        return rev;
    }
    public static void main(String args[])
    {
        System.out.print("no: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m =rev(n);
        if (m == n)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}