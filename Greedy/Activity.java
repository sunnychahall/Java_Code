
import java.util.*;





public class Activity{
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};


        int[][] activity = new int[start.length][3];


        for (int i = 0; i < start.length; i++)
            {
                activity[i][0] = i;
                activity[i][1] = start[i];
                activity[i][2] = end[i];
            }


        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> list = new ArrayList<>();
        //first activity
        int maxCount = 1;
        list.add(activity[0][0]);
        int lastEnd = activity[0][2];

        for (int i = 1; i < end.length; i++)
            {
                if (activity[i][1] >= lastEnd)
                    {
                        maxCount++;
                        list.add(activity[i][0]);
                        lastEnd = activity[i][2];
                    }
            }

        System.out.println("Total: " + maxCount);

        for (int i = 0; i < list.size();  i++)
            {
                System.out.print("A" + list.get(i) + " ");
            }
            System.out.println();

    }
}