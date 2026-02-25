public class Recursion{
    public static void main(String[] args)
    {
        int[] arr = {2, 2, 2, 4, 5, 7};
        System.out.println(isSort(arr, 0));
        System.out.println(power(5, 3));
        System.out.println(lastoccur(arr, 2, 0));

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

    public static int lastoccur(int[] arr, int key, int i)
    {
        //base case
        if (i == arr.length)
            {
                return -1;
            }

        // look forward
        int index = lastoccur(arr, key, i + 1);

        //check with self
        if (index == -1 && arr[i] == key)
            {
                return i;
            }
        return index;
        
    }
}