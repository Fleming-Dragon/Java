import java.util.Scanner;

public class day1_5 {
    public static void main(String ved[])
    {
        System.out.println("Program to print Table");

        Scanner ip = new Scanner (System.in);


        System.out.println("Enter the table you wanna print : ");
        int num = ip.nextInt();
        for(int i = 1 ; i <= 10 ; i ++ )
        {
            System.out.println(num + "x" + i +"=" + num*i);
        }

        for(int i = 0 ; i < 5 ; i++)
        {
            if(i==3)
            continue;

            System.out.println(i);
        }

        for (int i = 0 ; i< 6 ; i++)
        {
            System.out.println("Hello world");
        }

        for (int i = 0 ; i< 6 ; i++)
        {
            System.out.println(i);
        }

        int i = 0;
        do{
            System.out.println("hello world");
            i ++ ;
        }while(i <7);

        i = 10;
        do
        {
            System.out.println(i);
            i--;
        }while(i>0);
    }
}
