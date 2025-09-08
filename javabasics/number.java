import java.util.*;
public class number{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("negative");

        }
    }
}