import java.util.*;
public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter no: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = n; i > 1; i--)
        {
            fact = fact * i;
        }
        System.out.println("Factorial: " + fact);

    }
}
