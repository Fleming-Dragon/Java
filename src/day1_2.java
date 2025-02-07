import java.awt.geom.Area;

//areas
public class day1_2 {
    public static void main (String ved[])
    {

        area ob = new area();

        System.out.println(ob.circleArea(200));
        System.out.println(ob.rectangleArea(20,30));
        System.out.println(ob.squareArea(30));
        System.out.println(ob.triangleArea(20,30));


    }
}

class area
{
    public double circleArea(double radius)
    {
        return radius*radius*Math.PI;
    }

    public double squareArea(double side)
    {
        return side*side;
    }

    public double rectangleArea(double height, double width)
    {
        return height*width;
    }

    public double triangleArea(double base , double height)
    {
        return 0.5*base*height;
    }


}