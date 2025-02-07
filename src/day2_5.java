public class day2_5 {
    public static void main(String[] args) {


        MethodOverloading ob1 = new MethodOverloading();
        System.out.println(ob1.addition());
        System.out.println(ob1.addition(12,34));
        System.out.println(ob1.addition(12,34,56));
        System.out.println(ob1.addition(23,23.5));
        System.out.println(ob1.addition(23.3f,45.3));
    }
}

class MethodOverloading
{
    int a , b;
    int addition()
    {
       return a+b;
    }
    int addition (int a , int b )
    {
        return a+b;
    }

    int addition(int a , int b , int c)
    {
        return a+b+c;
    }

    float addition(int a , float b)
    {
        return a+b;
    }

    double addition(float a , double b)
    {
        return a+b;
    }
}
