import java.util.*;
public class capitalize {

    public static StringBuilder capitalize(String name)
    {
        StringBuilder sb = new StringBuilder("");
        int n = name.length();
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);
        for (int i = 1; i < n; i++)
            {
                if (name.charAt(i) == ' ' && i < name.length() - 1)
                    {
                sb.append(name.charAt(i)); 
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else
                {
                    sb.append(name.charAt(i));
            }
        }
            return sb;
    }
    public static void main(String args[])
    {
        System.out.print("Enter Sentence: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(capitalize(str));
    }
}

