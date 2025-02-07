public class day4_7 implements DefaultExample
{
    public static void main(String[] args) {

        day4_7 d1 = new day4_7();
        d1.display();
    }
}


interface DefaultExample
{
    default void display()
    {
        System.out.println("This is a default method ");
    }
}

