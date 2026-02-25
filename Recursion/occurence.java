public class occurence
{
    public static void main(String[] args)
    {
        int key = 3;
        int[] arr = {3, 3, 4, 2, 3, 6, 3};
        found(arr, key, 0);
        System.out.println();
    }

    public static void found(int[] arr, int key, int index)
    {
        if (index == arr.length)
            {
                return;
            }
        if (arr[index] == key)
            {
                System.out.print(index + " ");
            }
        found(arr, key, index + 1);
    }
}