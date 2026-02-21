import java.util.*;
public class fibbonaci {
    public static void main(String args[])
    {
        System.out.print("Enter value of n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Fibbonaci of "  + n + ": ");
        System.out.println(Fibbonaci(n));
    }

    public static int Fibbonaci(int n)
    {
        if (n == 1 || n == 0)
            {
                return n;
            }

            return Fibbonaci(n - 1) + Fibbonaci(n - 2);
    }
}
