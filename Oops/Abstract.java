public class Abstract
{
    public static void main(String args[])
    {
        Lion l = new Lion();
        l.walk();
        l.eat();
        System.out.println(l.color);
        l.ChangeColor();
        System.out.println(l.color);

    }
}

abstract class Animal {
    String color;
    Animal()
    {
        color = "Brown";
    }
    void eat()
    {
        System.out.println("Eats everything");
    }
    abstract void walk();
}

class Lion extends Animal{
   void walk()
   {
      System.out.println("4 legs walk");
   }
   void ChangeColor()
   {
    color = "Light_Brown";
   }
}