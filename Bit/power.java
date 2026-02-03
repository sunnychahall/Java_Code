import java.util.*;
public class power {
    public static boolean isPower_two(int n)
    {
         return ((n & (n - 1)) == 0);
    }
    public static void main(String args[])
    {
        System.out.print("Check that number is power of two enter no: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Answer: " + isPower_two(n));
    }
    
}
