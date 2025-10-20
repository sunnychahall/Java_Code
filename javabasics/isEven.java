import java.util.*;
public class isEven {
    public static void isEven(int n)
    {
        if (n % 2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String args[])
    {
        System.out.print("Enter no: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        isEven(n);
    }
        
}
