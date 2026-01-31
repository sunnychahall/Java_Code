public class Oops
{
    public static void main(String args[])
    {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColour("Blue");
        System.out.println(p1.colour);
        p1.setTip(5);
        System.out.println(p1.getTip());
        
    }
}
class Pen
{
    String colour;
    private int tip;

    int getTip()
    {
        return this.tip;
    }

    void setColour(String newColour)
    {
        colour = newColour;
    }

    void setTip(int newTip)
    {
        tip = newTip;
     }
}