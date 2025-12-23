
import java.util.Arrays;

public class reverseArray {
    public static int[] ReverseArray(int[] arr)
    {
        int[] reverse = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            {
                        reverse[arr.length - 1 - i] = arr[i]; 
            }
            return reverse;
    }
    public static void main(String[] args) {
        {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int[] rev = ReverseArray(arr);
            System.out.println(Arrays.toString(rev));
        }
    }
}
