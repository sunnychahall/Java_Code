import java.util.*;
public class bill {
    public static void main(String[] args) {
        System.out.println("Enter cost of pencil: ");
        Scanner scanner = new Scanner(System.in);
        float pencil = scanner.nextFloat();
        System.out.println("Enter price of pen: ");
        float pen = scanner.nextFloat();
        System.out.println("Enter cost of eraser: ");
        float eraser = scanner.nextFloat();
        float total_cost = pencil + pen + eraser;
        float bill = total_cost + ((total_cost * 18) / 100);
        System.out.println("Bill: " + bill);

    }
}
