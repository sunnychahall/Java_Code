public class kadane {
    public static int Kadane(int[] num)
    {
        int max = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int i = 0; i < num.length; i++)
        {
            current_sum += num[i];
            if (current_sum < 0)
                {
                    current_sum = 0;
                }
            if (max < current_sum)
                {
                    max = current_sum;
                }
        }
        if (max == 0)
            {
                int Max = Integer.MIN_VALUE;
                for (int i = 0; i < num.length; i++)
                {
                    if (num[i] > Max)
                        {
                            Max = num[i];
                        }
                }
                max = Max;
            }
         
                   return max;
    }

public static void main(String args[])
    {
        int[] num = {-1, -2, 3};
        int max = Kadane(num);
        System.out.println("Max Sum:" + max);
    }
}