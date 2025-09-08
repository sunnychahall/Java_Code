import java.util.*;
public class area {
    public static void main(String[] args){
        System.out.print("Enter side of square: ");
        Scanner scanner = new Scanner(System.in);
        float side = scanner.nextFloat();
        float area = side * side;
        System.out.println("Area of square:" + area);
    }
}
