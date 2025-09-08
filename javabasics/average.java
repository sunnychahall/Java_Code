import java.util.*;
public class average{
    public static void main(String[] args) {
        // Average of three numbers:
        System.out.print("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        float average = (a + b + c) / 3;
        System.out.println("Average:" + average);
    }
}