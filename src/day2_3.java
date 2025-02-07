public class day2_3 {
    public static void main(String[] args) {

        Car c1 = new Car("Red" , 15000 , 1000000 );
        Car c2 = new Car("Red" , 25000 , 40000 );
        Car c3 = new Car("Red" , 5000 , 1500000 );

        System.out.println(Car.carCompare(c1 , c2));
    }
}

class Car
{
    String color;
    int mileage;
    float price;

    Car(String color , int mileage , float price)
    {
        this.color = color;
        this.mileage = mileage;
        this.price  = price;
    }

    public static String carCompare(Car C1 , Car C2)
    {

        if ( C1.mileage > C2.mileage)
        {
            if (C1.price < C2.price)
                return "C1 is a better car";
            else
                return "Based on Mileage C1 is better but not cost efficient";
        }
        else
        {
            if (C2.price < C1.price)
                return "C2 is a better car";
            else
                return "Based on Mileage C2 is better but not cost efficient";
        }
    }
}
