import java.util.Arrays;

public class triplet {
    public static int[]  Triplet(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
            {
                for(int j = i + 1; j < nums.length; j++)
                    {
                        for(int k = j + 1; k < nums.length; k++)
                            {
                                int sum = nums[i] + nums[j] + nums[k];
                                if (sum == 0)
                                    {
                                        return new int[] {i , j, k};
                                    }
    }
}
            }
            return new int[] {};
        }
        public static void main(String[] args) {
            int[] nums = {-1, 0, 1, 2, -1, 4};
            int[] result = Triplet(nums);
            System.out.println(Arrays.toString(result));
        }
    }
