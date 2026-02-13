public class Polymorphishm {
    public static void main(String args[])
    {
        Calculator casio = new Calculator();
        System.out.println(casio.sum(1, 2, 3));
        System.out.println(casio.sum(1, 2));
        System.out.println(casio.sum((float)1.5, (float)2.5));
        Deer deer = new Deer();
        deer.eat();
    }
}



//OVERLOADING (diff parameters)
class Calculator
{
    int sum(int a, int b)
    {
        return a + b;
    }
    int sum(int a, int b, int c)
    {
        return a + b + c;
    }
    float sum(float a, float b)
    {
        return a + b;
    }
}


//OVERRIDING (diffrent methods work)

class Animals
{
    void eat()
{
    System.out.println("Eats Everything");
}
}

class Deer extends Animals
{
    void eat()
    {
        System.out.println("Eats  Grass");
    }
}
