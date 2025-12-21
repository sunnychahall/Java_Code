public class trapwater {
    public static int trapWater (int[] arr)
    {
        int[] Left_max = new int[arr.length];
        Left_max[0] = arr[0];
        for(int i = 1; i < arr.length; i++)
            {
                Left_max[i] = Math.max(Left_max[i - 1], arr[i]);
            }
        int[] Right_max = new int[arr.length];
        Right_max[arr.length - 1] = arr[arr.length - 1];
        for(int i = (arr.length - 2); i >= 0; i--)
            {
                Right_max[i] = Math.max(Right_max[i + 1], arr[i]);
            }
        int Water_trap = 0;
        for (int i = 0; i < arr.length; i++)
            {
                    int s = Math.min(Right_max[i], Left_max[i]);
                            int trap = s - arr[i];
                            Water_trap += trap;
                         }
            return Water_trap;
    }
    public static void main(String args[])
    {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int Water = trapWater(arr);
        System.out.println("Trapped Water: " + Water);
    }
}
