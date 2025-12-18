public class prefix{
    public static int maxSum(int[] array)
    {
        int max = 0;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for (int i = 1; i < array.length; i++)
            {
                prefix[i] = prefix[i - 1] + array[i];
            }
        for (int i = 0; i < array.length; i++)
            {
                for (int j = i; j < array.length; j++)
                    {
                        int sum = i == 0 ? prefix[j]: prefix[j] - prefix[i - 1];
                        if (max < sum)
                            {
                                max = sum;
                            }
                    }
            }
            return max;
        }
    public static void main(String args[])
    {
        int[] array = {1, -2, 6, -1, 3};
        int max = maxSum(array);
        System.out.println("Max Sum:" + max);
    }
}