public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sunny Chahal");
        System.out.println(s1.name);
        Pen p1 = new Pen();
    }
}

class Student
{
    String name;
    int roll_no;

    // Parameterized
    Student(String name)
    {
        this.name = name;
        //System.out.println("Name: " + name); we can also print here as well:)
    }
}



class Pen{
    int tip;
    String colour;
      //Non - Parameterized contructor 
      
      Pen()
      {
        System.out.println("Non - Parameterize constructor is called....");
      }
    }