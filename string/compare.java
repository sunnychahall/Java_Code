public class compare
{
    public static void main(String args[])
    {
        String fruits[] = {"apple", "mango", "guava", "avacado"};
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++)
            {
                // .equals function used only for equality
                // Z < a in compareTo caseSenstive
                
                if (fruits[i].compareTo(largest) > 0)
                    {
                        largest = fruits[i];
                    }
            }
        System.out.println(largest);
    }
}