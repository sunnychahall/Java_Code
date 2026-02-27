public class pairing {
    public static void main(String[] args)
    {
        int freinds = 3;
        System.out.println(pairing(freinds));

    }

    public static int pairing(int n)
    {
        //base
        if (n == 1 || n == 2)
            {
                return n;
            }
        //sigle pairing(n - 1);
        
        //pair options to choose pairing freind is n -1 *  pairing(n - 2);
        

        return pairing(n - 1) + (n - 1) * pairing(n - 2);
    }
}
