public class maxSubarray {
    public static int Maxsubbaray (int num[])
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++)
            {
                int first = i;
                for (int j = i; j < num.length; j++)
                    { int sum = 0;
                        int last = j;
                        for (int k = i; k <= j; k++)
                            {
                                
                                sum += num[k];
                                
                            }
                            if (sum > max)
                                {
                                    max = sum;
                                }
                    }
            }
            System.out.println("Max Sum: " + max);
            return 1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        Maxsubbaray(numbers);

    }
}