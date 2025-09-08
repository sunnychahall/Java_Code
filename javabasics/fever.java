import java.util.*;
public class fever {
    public static void main(String[] args) {
        System.out.print("Your Body Temprature: ");
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextDouble();
        if (temp > 100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You do not have fever");
        }
    }
}
