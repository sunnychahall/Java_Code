import java.util.*;
public class numbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Numbers in Increasing Order: ");
        print_n(n);
    }

    public static void print_n(int n)
    {
        
        if (n == 1)
            {
                System.out.println(n);
                return;
            }

            // print before recursion call for print in decreasing order
        print_n(n - 1);
        System.out.println(n);
        
    }
}