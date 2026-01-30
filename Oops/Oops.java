public class Oops
{
    public static void main(String args[])
    {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColour("Blue");
        System.out.println(p1.colour);
        p1.tip = 5;
        System.out.println(p1.tip);
        
    }
}
class Pen
{
    String colour;
    int tip;

    void setColour(String newColour)
    {
        colour = newColour;
    }

    void setTip(int newTip)
    {
        tip = newTip;
     }
}