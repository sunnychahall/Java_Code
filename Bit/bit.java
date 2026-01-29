
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

    public static void main(String args[])
    {
        System.out.println(Get_ith_Bit(4 , 2));
        System.out.println(set_Bit(4, 2));
    }
}
