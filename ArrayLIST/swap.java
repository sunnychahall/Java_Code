import java.util.*;

public class swap{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        System.out.println(list);
        int temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp);
        System.out.println(list);

    }
}

