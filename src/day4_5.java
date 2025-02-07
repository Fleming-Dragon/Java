//interfacea and multiple inheritance
public class day4_5 {
    public static void main(String[] args) {
    Area2 a1 = new Area2();
    a1.area(2,3);
    a1.area(2);
    }
}

interface Rectangle1
{
    public void area(int length , int breadth);
}
interface Square1
{
    public void area(int side);
}
class Area2 implements Rectangle1 , Square1
{
    public void area(int length , int breadth)
    {
        System.out.println("The area of the Reactnage is Length * BReadth : " + length*breadth);
    }


    @Override
    public void area(int side) {
        System.out.println("This is area of Square : " + side*side);
    }
}