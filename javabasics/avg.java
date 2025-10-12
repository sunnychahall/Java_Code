import java.util.*;
public class avg{
    public static float avg(int n, int m, int s)
    {
       float avg;
       avg = (n + m + s) / 3;
       return avg;
    }
    public static void main(String args[])
    {
        System.out.print("Enter Three no: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        float m = avg(n1, n2, n3);
        System.out.println("Average: " + m);
    }
}