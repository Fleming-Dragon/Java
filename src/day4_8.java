public class day4_8 {
    public static void main(String[] args) {
        calculate c1 = new calculate();
        System.out.println("Addition : " + c1.add(10,20));
        System.out.println("Substraction : " + c1.sub(100,50));
    }
}

interface Addition
{
    public int add(int a , int b);
}

interface Substraction
{
    public int sub(int a , int b);
}

class calculate
{
    public int add(int a , int b)
    {
        return a+b;
    }

    public int sub(int a , int b)
    {
        return a-b;
    }
}
