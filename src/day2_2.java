import java.util.Scanner;

public class day2_2 {
    //Bank Management System

    public static void main(String ved[])
    {

        BankUser b1 = new BankUser("Ved" , 34);

        b1.checkBalance();

        b1.deposit();

        b1.checkBalance();

        b1.withdrawl();

        b1.checkBalance();

    }

}

class BankUser
{
    Scanner ip = new Scanner (System.in);
    String name;
    float Balance;
    int Acc_Number;


    BankUser( String name , int Acc_Number )
    {
        this.name = name;
        this.Acc_Number = Acc_Number;
        this.Balance = 0;
    }

    public void checkBalance()
    {
        System.out.println("\nThe Data is as follows");
        System.out.println("Name : " + name);
        System.out.println("Account NUmber : " + Acc_Number );
        System.out.println("Balance : " + Balance);
        System.out.println("\n");
    }

    public void deposit()
    {
        System.out.println("Enter the amount you want to deposit : ");
        float temp = ip.nextFloat();
        Balance = Balance+temp;
    }

    public void withdrawl()
    {
        System.out.println("Enter the amount you want to deposit : ");
        float temp = ip.nextFloat();

        if(temp > Balance)
            System.out.println("You do not have sufficient Balance");
        else
            Balance = Balance-temp;

    }


}