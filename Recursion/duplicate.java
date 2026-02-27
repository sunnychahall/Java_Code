public class duplicate {
    public static void main(String args[])
    {
        String s = "hhhheeello";
        removes_duplicate(s, 0, new StringBuilder(), new boolean[26]);
    }

    public static void removes_duplicate(String s, int index, StringBuilder sb, boolean[] map)
    {
        //base
        if (index == s.length())
            {
                System.out.println(sb);
                return;
            }

        //recursion
        char cur = s.charAt(index);
        if (map[cur - 'a'] == true)
            {
               removes_duplicate(s, index + 1, sb, map);
            }
            else{
                map[cur - 'a'] = true;
                removes_duplicate(s, index + 1, sb.append(cur), map);
            }
    }
}
