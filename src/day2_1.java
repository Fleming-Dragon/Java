import java.util.Scanner;

public class day2_1 {
    public static void main(String ved[])
    {
        EmployeeData E1 = new EmployeeData();
        EmployeeData E2 = new EmployeeData();
        EmployeeData E3 = new EmployeeData();
        EmployeeData E4 = new EmployeeData();
        EmployeeData E5 = new EmployeeData();

        E1.insertData();
        E2.insertData();
        E3.insertData();

        E1.displayData();
        E2.displayData();
        E3.displayData();

        System.out.println( "This is the total count of all Employee : " + EmployeeData.getCount());

        System.out.println("Highest salary is "+EmployeeData.highestSalary(E1,E2,E3));

    }
}

class EmployeeData
{
    private Scanner ip = new Scanner(System.in);
    private String emp_name;
    private int emp_id;
    float emp_salary;
    static int count = 0;

    static String Company = "Seed Infotech";


    EmployeeData()
    {
        count++;
    }

    public void insertData()
    {
        System.out.println("Enter the Table data for Employee");
        System.out.println("Name : ");
        emp_name = ip.nextLine();
        System.out.println("Id");
        emp_id = ip.nextInt();
        System.out.println("Salary");
        emp_salary = ip.nextFloat();

    }

    public static int  getCount()
    {
        return count;
    }

    public void displayData()
    {
        System.out.println("Name : " + emp_name);
        System.out.println("Id : " + emp_id);
        System.out.println("Salary : " + emp_salary);
        System.out.println("\n");
    }

    public static float highestSalary(EmployeeData E1 , EmployeeData E2 , EmployeeData E3)
    {
        float a = E1.emp_salary;
        float b = E2.emp_salary;
        float c = E3.emp_salary;

        if( a > b)
        {
            if (a > c)
            {
                return a;
            }
            else
            {
                return c;
            }
        }
        else if (b > a)
        {
            if (b > c)
            {
                return b;
            }
            else
            {
                return c;
            }
        }
        else
        {
            return 1;
        }

    }
}
