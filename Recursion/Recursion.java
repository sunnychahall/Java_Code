public class Recursion{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 5, 7, 1};
        System.out.println(isSort(arr, 0));
        System.out.println(power(5, 3));

    }

    

    public static boolean isSort(int[] arr, int n)
    {
        if (n == arr.length - 1)
            {
                return true;
            }
        else if (arr[n] > arr[n + 1])
            {
                return false;
            }
        return isSort(arr, n + 1);
    }

    public static int power(int x, int n)
    {
        if (n == 0)
            {
                return 1;
            }
        return x * power(x, n - 1); 
    }
}