public class Interface {
    public static void main(String args[])
    {
        Beer b = new Beer();
        b.eat();
    }
}

interface Herbivore
{
    void eat();
    
}

interface Carnivore
{
   void eat();
}

class Beer implements Herbivore, Carnivore
{
   public void eat()
    {
        System.out.println("Both Grass and Flesh");
    }
}