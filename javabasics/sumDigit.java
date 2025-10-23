import java.util.*;
public class sumDigit
{
    public static int SumDigit(int n)
    {
        int rem = 0;
        int sum = 0;
        while (n > 0)
        {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.print("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = SumDigit(n);
        System.out.println("Sum of Digits: " + m);
    }
}