public class isSorted{
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 5, 7, 1};
        System.out.println(isSort(arr, 0));
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
}