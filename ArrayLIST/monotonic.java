
import java.util.*;

public class monotonic {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(5);
        System.out.println(isMonotonic(list));
    }

    public static boolean isMonotonic(ArrayList<Integer> list)
    {
        boolean Inc = true;
        boolean Dec = true;
        for (int i = 0; i < list.size() - 1; i++)
            {
                if (list.get(i) < list.get(i + 1))
                    {
                        Dec = false;
                    }
                if (list.get(i) > list.get(i + 1))
                    {
                        Inc = false;
                    }
            }
        return Inc || Dec;
    }


}
