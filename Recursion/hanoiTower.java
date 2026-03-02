public class hanoiTower {
    public static void main(String[] args) {
        int n = 3;
        Tower(n, "S", "H", "D");
    }

    public static void Tower(int n, String src, String helper, String des)
    {
        //base
        if (n == 1)
            {
               System.out.println("Transfer Disk " + n + " From "  + src + " to " + des);
               return ;
            }

        //recursion
        Tower(n - 1, src, des, helper);
        System.out.println("Transfer Disk " + n + " From "  + src + " to " + des);
        Tower(n - 1, helper, src, des);
            
    }
}
