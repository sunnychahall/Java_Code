import java.util.*;
public class sum{
    public static void main(String[] args) {
        int sum_even = 0, sum_odd = 0, choice, n; 
        do{
        System.out.print("Enter no: ");
        Scanner scanner = new Scanner(System.in);
         
         n = scanner.nextInt();
        
        if (n % 2 == 0)
        {
            sum_even += n;
        }
        else 
        {
            sum_odd += n;
        }
        System.out.println("Sum of even numbers: " + sum_even);
        System.out.println("Sum of odd numbers: " + sum_odd);

        System.out.print("if you are finished with numbers press 0 or otherwise press 1: ");
        choice = scanner.nextInt();

    }while(choice == 1);
}


}
