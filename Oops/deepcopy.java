


public class deepcopy
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.name = "Sanket";
        s1.roll_no = 59;
        s1.marks[0] = 34;
        s1.marks[1] = 48;
        s1.marks[2] = 59;
       

        Student s2 = new Student(s1);
        System.out.println(s2.name);
        s1.marks[2] = 90;
        for (int i = 0; i < 3; i++)
            {
                System.out.println(s2.marks[i]);
            }

    }
}


class Student
{
    int roll_no;
    String name;
    int[] marks = new int[3];
    Student ()
    {
        
    }

    Student(Student s1)
    {
        marks = new int[3];
        this.name = s1.name;
        this.roll_no = s1.roll_no;
        for (int i = 0; i < 3; i++)
         {
            this.marks[i] = s1.marks[i];
         }
    }
}
