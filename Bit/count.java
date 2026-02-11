import java.util.*;
public class count {
    public static int Count(int n)
    {
        int count = 0;
        while(n > 0)
            {
                if ((n & 1) == 1)
                    {
                        count++;
                    }
                    n = n >> 1;  
            }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("Enter No: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Count(n));
    }
}
