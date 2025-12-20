import java.util.*;
public class twice{
    public static boolean istwice(int[] num)
    {
        
        for (int i = 0; i < num.length; i++)
            {
                int a = num[i];
                for (int j = i+1; j < num.length; j++)
                    {
                        if (num[j] == a)
                            {
                                return true;
                                
                            }
                    }
            }
            
            return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Enter value of num: ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
        {
            num[i] = scanner.nextInt();
        }
        System.out.println(istwice(num));
    }
}