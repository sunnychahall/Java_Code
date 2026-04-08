
import java.util.*;


public class nonRepeat{

    
    public static void main(String[] args) {
        String s = "aabbcdd";
        int[] map = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++)
            {
                char ch = s.charAt(i);
                q.add(ch);
                map[ch - 'a']++;
                while (!q.isEmpty() && map[q.peek() - 'a'] > 1)
                {
                    q.remove();
                }
                if (q.isEmpty())
                    {
                        System.out.println("-1");
                    }
                else{
                    System.out.println(q.peek() + " ");
                }
            }
    }
}