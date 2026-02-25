
import java.util.Arrays;

public class merge
{
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 1, 6, 9, 5, 7};
        merge_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge_sort(int[] arr, int start, int end)
    {
        int mid = start + (end - start) / 2;
        if (start >= end)
            {
                return; 
            }
        merge_sort(arr, start, mid); //left
        merge_sort(arr, mid + 1, end); // right
        merge(arr, mid, start, end);
    }

    public static void merge(int[] arr, int mid, int start, int end)
    {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end)
            {
                if (arr[i] < arr[j])
                    {
                        temp[k] = arr[i];
                        k++;
                        i++;
                    }
                    else 
                        {
                            temp[k] = arr[j];
                            k++;
                            j++;
                        }
            }

        //remaining elements
        while (i <= mid)
            {
                temp[k] = arr[i];
                        k++;
                        i++;
            }
        
            while (j <= end)
                {
                    temp[k] = arr[j];
                            k++;
                            j++;
                }
        //copy into arr
        for (k = 0; k < temp.length; k++)
            {
                arr[start + k] = temp[k];
            }

    }
}