
public class shortest {
    public static float shortestPath(String directions)
    {
        int x = 0;
        int y = 0;
       int n = directions.length();
       for (int i = 0; i < n; i++)
        {
            if (directions.charAt(i) == 'W')
                {
                    x--;
                }
            if (directions.charAt(i) == 'E')
                {
                    x++;
                }
            if (directions.charAt(i) == 'N')
                {
                    y++;
                }
            if (directions.charAt(i) == 'S')
                {
                    y--;
                }
        } 
        float result = (float)Math.sqrt(x * x + y * y);
        return result;
    }
    public static void main (String args[])
    {
        String direction = "WNEENESENNN";
        System.out.println("Shortest path: " + shortestPath(direction));
    }
}
