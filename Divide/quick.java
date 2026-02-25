import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 9, 5, 7};
        quick_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_sort(int[] arr, int start, int end)
    {
        if (start >= end)
            {
                return;
            }
        int pivotIndex = pivotPosition(arr, start, end);
        //left
        quick_sort(arr, start, pivotIndex - 1);
        quick_sort(arr, pivotIndex + 1, end);
    }

    public static int pivotPosition(int[] arr, int start, int end)
    {
        int temp;
        int pivot = arr[end];
        int i = start - 1;
        int j = start;
        for (j = start; j < end; j++)
            {
                if(arr[j] < pivot)
                    {
                        i++;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = arr[i];

                    }     
            }
            i++;
                        temp = arr[i];
                        arr[i] = arr[end];
                        arr[end] = arr[i];
                        return i;
    }
}
