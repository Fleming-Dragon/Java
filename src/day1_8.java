public class day1_8 {

    public static void main(String ved[])
    {
        Employee E1 = new Employee("Ved", 45 , "Nashik" , 65000);
        Employee E2 = new Employee("Dev", 78 , "Pune" , 75000);
        Employee E3 = new Employee("Ram", 90 , "Nagpur" , 95000);

        E1.getData();
        E2.getData();
        E3.getData();

        Employee.meth();
        meth2();
    }

    static void meth2()
    {
        System.out.println("This is static method2");
    }
}

class Employee
{
    String name ;
    int id ;
    String city;
    float salary;

    Employee(String name , int id , String city, float salary)
    {
        this.name = name;
        this.id = id;
        this.salary  = salary;
        this.city = city;
    }


    Employee()
    {

    }

    void getData()
    {
        System.out.println("ID : " + id);
        System.out.println("Name : " +name);
        System.out.println("Salary : " + salary);
        System.out.println("City : " + city);
        System.out.println();
    }

    static void meth()
    {
        System.out.println("This is static method");
    }
}
