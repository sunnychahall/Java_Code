public class inheritance {
    public static void main(String[] args) {

        Dog sanket = new Dog();
        sanket.legs = 2;
        sanket.colour = "Brown";
        sanket.breed = "Vodafone";

        System.out.println(sanket.legs);
        System.out.println(sanket.colour);
        System.out.println(sanket.breed);

        sanket.breathe();  // inherited from Animals
    }
}

class Animal {
    String colour;
    void breathe() {
        System.out.println("inhales");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}
