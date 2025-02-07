public class day1_7 {
    public static void main(String ved[])
    {
            Student s1 = new Student();
        System.out.println("\n ID" +s1.sid +
                "\n Name" + s1.name+
                "\n Year" + s1.year);
    }
}

class Student
{
    int sid = 100;
    String name = "Ved";
    int year = 3;
}