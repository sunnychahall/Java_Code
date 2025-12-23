import java.util.*;
public class MinMax {
    public static int[] max_min(int[] nums)
    {
        
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++)
            {
                if (nums[i] > Max)
                    {
                        Max = nums[i];
                    }
                if (nums[i] < Min)
                    {
                        Min = nums[i];
                    }
            } 
            return new int[] {Min, Max};
            
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 9};
        int[] arr = max_min(nums);
        System.out.println(Arrays.toString(arr));
    }
    
}
