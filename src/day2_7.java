public class day2_7 {
    public static void main(String[] args) {

        Student1 s1 = new Student1("Ved" , 23);
        s1.display();


        Student1 s2 = new Student1("Dev" , 53);
        s2.display();

    }
}

class Student1
{
    String name ;
    int roll;

    static String college = "MCOERC";

    Student1(String name , int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    public void display()
    {
        System.out.println("Student Data");
        System.out.println("Name : "+ name);
        System.out.println("Roll : "+ roll);
        System.out.println("College : "+ college);
        System.out.println();
    }
}
