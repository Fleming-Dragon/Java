public class day4_6 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.display();
    }
}

interface A
{
    final int a = 100;
    public void display();
}


class B implements A
{
    public void display()
    {
        System.out.println("This is the value of " + a);
    }
}