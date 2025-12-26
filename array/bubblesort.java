import java.util.*;
public class bubblesort{
    public static int[] BubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
            {
                for (int j = 0; j < arr.length - i - 1; j++)
                    {
                        if (arr[j] > arr[j + 1])
                            {
                                int temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                    }
            }
            return arr;
    }
    public static void main(String args[])
    {
        int[] arr = {1, 4, 6, 8, 2, 5};
        int[] result = BubbleSort(arr);
        System.out.println(Arrays.toString(result));
    }
}