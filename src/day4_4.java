public class day4_4 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.display();

        Child c1 = new Child();
        c1.display();

        Parent p2 = new Child();
        p2.display();






    }
}

class Parent
{
    public void display()
    {
        System.out.println("This is a Parent class");
    }


}

class  Child extends Parent
{
    public void display()
    {
        System.out.println("This is  a child class");
    }

    public void info()
    {
        System.out.println("This is get data information");
    }
}