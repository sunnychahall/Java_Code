public class OddEven {
    public static void isEvenOdd(int n)
    {
        int bitmask = 1;
        if ((n & bitmask) == 1 )
            {
                System.out.println("Odd");
            }
        else{
            System.out.println("Even");
        }
    }
    public static void main(String args[])
    {
        isEvenOdd(3);
        isEvenOdd(4);
    }
}
