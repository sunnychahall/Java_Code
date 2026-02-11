public class Exponential{
    public static int Exponent(int a, int x)
    {
        int answer = 1;
        while (x > 0)
            {
                if ((x & 1) == 0)
                    {
                        answer = 1 * answer;
                    }
                else{
                    answer = a * answer; 
                }
                x = x >> 1;
                a = a * a;
                
            }
            return answer;
        
    }
    public static void main(String args[])
    {
        System.out.println(Exponent(2, 5));
    }
}