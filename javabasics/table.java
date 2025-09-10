
import java.util.*;

public class table {
    public static void main(String[] args) {
        System.out.print("Enter no: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Table of number:");
        for(int i = 1; i <= 10; i++ )
        {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
