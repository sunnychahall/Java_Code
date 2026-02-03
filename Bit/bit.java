
public class bit {
    public static int Get_ith_Bit(int n, int i)
    {
        int Bitmask = 1 << i;
        return (n & Bitmask) == 0 ? 0 : 1;
    }
    
    public static int set_Bit(int n, int i)
    {
        int Bitmask = 1 << i;
        return Bitmask | n;
    }

    public static int clearBit(int n, int i)
    {
        int Bitmask = ~(1 << i);
        return Bitmask & n;
    }

    public static int UpdateBit(int n, int i, int val)
    {
        clearBit(n,  i);
        int Bitmask = val << i;
        return Bitmask | n;
        

    }

    public static int clearLastBit(int n, int i)
    {
        int Bitmask = (~0) << i;
        return Bitmask & n;
    }

    public static int clearRange(int n, int i, int j)
    {
        int a = ((~0) << j + 1);
        int b = ((1 << i) - 1);
        return (a | b) & n;
    }

    public static void main(String args[])
    {
        System.out.println(Get_ith_Bit(4 , 2));
        System.out.println(set_Bit(4, 2));
        System.out.println(clearBit(4, 2));
        System.out.println(UpdateBit(4, 2, 0));
        System.out.println(clearLastBit(4, 2));
        System.out.println(clearRange(5, 0, 1));
    }
}
