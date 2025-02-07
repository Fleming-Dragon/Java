import java.awt.geom.Area;

//heirarchical inheritaance
//polymorphism overiding

public class day4_1 {
    public static void main(String[] args) {

        Area1 ob = new Area1();
        ob.area();

        Rectangle ob1 = new Rectangle();
        ob1.area();

        Circle ob2 = new Circle();
        ob2.area();

        Square ob3 = new Square();
        ob3.area();
    }
}

class Area1
{
    public void area()
    {
        System.out.println("The area of alll shapes");
    }
}

class Circle extends Area1
{
    @Override
    public void area() {
        int r  =2;
        System.out.println("The area of the Circle is : " +2*2* (Math.PI));;
    }
}

class Rectangle extends Area1
{
    @Override
    public void area() {
        int h = 5;
        int w = 4;
        System.out.println("The area of the given rectangle is : " + h*w);
    }
}

class Square extends Area1
{
    @Override
    public void area() {
        int s = 5;
        System.out.println("THe area of the square is : " + s*s);
    }
}
