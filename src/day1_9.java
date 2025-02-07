public class day1_9 {
    public static void main(String ved[])
    {
        System.out.println(fact(5));

    }

    public static int fact(int fact)
    {
        int factorial = fact;
        for (int i = 1 ; i < fact; i++)
        {
            factorial = factorial * i;
        }
        return factorial;
    }
}
