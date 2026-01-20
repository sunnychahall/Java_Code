import java.util.*;
public class insertion
{
    public static int[] InsertSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
            {
                int curr = arr[i];
                int prev = i - 1;
                while (prev >= 0 && arr[prev] > curr)
                    {
                        arr[prev + 1] = arr[prev];
                        prev--;
                    }
                    arr[prev + 1] = curr; 

            }
            return arr;
    }
    public static void main(String args[])
    {
        int[] arr = {2, 45, 26, 33, 39};
        int[] result = InsertSort(arr);
        System.out.println(Arrays.toString(result));
    }
}