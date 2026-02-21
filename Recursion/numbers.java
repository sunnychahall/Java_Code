import java.util.*;
public class numbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number (Positive): ");
        int n = scanner.nextInt();
        
        System.out.println("Numbers in Increasing Order: ");
        print_n(n);
        System.out.println("Factorial of n: " + n);
        System.out.println(factorial(n));
    }

    public static void print_n(int n)
    {
        
        if (n == 1 || n == 0)
            {
                System.out.println(n);
                return;
            }

            // print before recursion call for print in decreasing order
        print_n(n - 1);
        System.out.println(n);
        
    }

    public static int factorial(int n)
    {
        if (n == 0 || n == 1)
            {
                return 1;
            }
        return n * factorial(n - 1);
        
    }
}