public class digits
{
    public static void main(String args[])
    {
        int n = 1974;
        print_String(n);
        System.out.println("");
    }

    public static void print_String(int n)
    {
       String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
       //Base case 
       if (n == 0)
            {
                return;
            }
        //recursion
        int num = (n % 10);
        print_String(n / 10);
        System.out.print(digits[num] + " ");
        }
}