import java.util.Scanner;

public class day1_4 {
    public static void main(String ved[])
    {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter your Details");


        System.out.println("Enter your name : ");
        String name = ip.nextLine();

        System.out.println("Enter your roll : ");
        int roll = ip.nextInt();

        System.out.println("Enter your Grades : ");
        String grades = ip.next();

        System.out.println("Enter your Attendance : ");
        float attendence = ip.nextFloat();


        Students s1 = new Students();
        s1.setData(name,roll,grades,attendence);
        s1.displayData();





    }
}


class Students
{
    private String name ;
    private int roll;
    private String grades;
    private float attendance;

    void setData(String name, int roll , String grades ,float attendance)
    {
      this.name = name;
      this.attendance = attendance;
      this.grades = grades;
      this.roll = roll;
    }

    void displayData()
    {
        System.out.println("======================================================");
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Grades : " + grades);
        System.out.println("Attendance : " + attendance);
        System.out.println("======================================================");
        
    }
}
