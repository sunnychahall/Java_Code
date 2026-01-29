import java.util.*;
public class Opreators
{
    public static void main(String args[])
    {
        System.out.print("Enter Opreators: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("a AND b : " + (a & b));
        System.out.println("a OR b : " + (a | b));
        System.out.println("a XOR b : " + (a ^ b));
        System.out.println("a complement : " + (~a));
        System.out.println("b complement : " + (~b));
        System.out.println("a left shift by b : " + (a << b));
        System.out.println("a right shift by b : " + (a >> b));
    }
}