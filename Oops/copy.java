public class copy {
    public static void main(String args[])
    {
        Student s1 = new Student("Sanket", 56);
        
        
        s1.marks[0] = 90;
        s1.marks[1] = 99;
        s1.marks[2] = 92;
        
        Student s2 = new Student(s1);
        s1.marks[2] = 20;
        for (int i = 0; i < 3; i++)
            {
                System.out.println(s2.marks[i]);
            }
        

        
    }
}

class Student
{
    String name;
    int roll_no;
    int marks[];

    
    Student(String name, int n)
    {
        marks = new int[3];
        this.name = name;
        this.roll_no = n;
        
    }

    //copy of constructor
    Student(Student s1)
    {
        this.marks = s1.marks;
        this.name = s1.name;
        this.roll_no = s1.roll_no;
    }
}
