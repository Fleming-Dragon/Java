import java.sql.SQLOutput;

interface Printer {
    void print();
}


interface AdditionInfo
{
    int add(int a , int b);

}
public class day5_2 {
    public static void main(String[] args) {
        // Lambda function to print "Hello, World!"
        Printer printer = () -> System.out.println("Hello, World!");

        // Calling the lambda function
        printer.print();

        AdditionInfo a1 = (a,b) ->{return (a+b);} ;
        int num = a1.add(100,200);
        System.out.println(num);
    }
}
