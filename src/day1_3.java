import javax.crypto.spec.PSource;
import java.util.Scanner;

public class day1_3 {
    //condtional statements

    public static void main(String ved[])
    {
//        int bal = 1000;
//
//
////        if(bal > 5000)
////            System.out.println("Balance is Sufficent Withdrawl is possible ");
////        else
////            System.out.println("Balance is insufficient");
//
//        int a , b ,c ;
//        a = 200;
//        b = 300;
//        c = 100;
//
//        if(a > b)
//        {
//            System.out.println("The value of a is greater");
//        }
//        else
//        {
//            System.out.println("The value of b is greater");
//        }
//
//        if (a %2 ==0)
//        {
//            System.out.println("The entered number is even");
//
//        }
//        else
//            System.out.println("the entered number is odd");
//
//
//        if(a > b)
//            {
//                if(a > c)
//                {
//                    System.out.println("A is greater");
//                }
//                else
//                {
//                    System.out.println("C is greater");
//                }
//            }
//        else if(b> a)
//        {
//            if(b > c)
//            {
//                System.out.println("B is greater");
//            }
//            else
//            {
//                System.out.println("C is greater");
//            }
//        }
//
//        int option = 2;
//        switch(option)
//        {
//            case 1 :
//                System.out.println("You have entered case 1");
//                break;
//
//            case 2 :
//                System.out.println("You have entered case 2");
//                break;
//
//            case 3 :
//                System.out.println("You have entered case 3");
//                break;
//
//            default:
//                System.out.println("Enter valid case ");
//        }

//          Cond ob = new Cond();
//        System.out.println("Enter the value");
//        ob.setData();
//
//        System.out.println("The stored value is : " +ob.getData());

        int a =100;
        boolean val = (a == 100? true : false );

        System.out.println(val);
    }
}


class Cond
{
    Scanner ip = new Scanner(System.in);
    private float value;
    private String name;
    public void setData(){
//            value = ip.nextInt();
//        value = ip.nextFloat();
        name = ip.next();
    }

    public String getData()
    {
        return name;
    }
}