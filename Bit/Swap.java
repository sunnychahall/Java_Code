import java.util.*;
public class Swap
{
    public static void main(String args[])
    {
        System.out.println("Enter two Numbers: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Before Swap\n" + "x: " + x + " y: " + y);
        x = x ^ y;
        y = x ^ y;
        x = y ^ x;
        System.out.println("After Swap\n" + "x: " + x + " y: " + y);

    }
}