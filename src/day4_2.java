import java.util.Scanner;

public class day4_2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter Your First String : ");
        String fword = ip.next();
        System.out.println("Enter Your Second String : ");
        String sword = ip.next();
        System.out.println("Enter Your First NUmber : ");
        int num1 = ip.nextInt();
        System.out.println("Enter Your Second Number : ");
        int num2 = ip.nextInt();


        System.out.println("fword + sword = "+ fword+sword);
        System.out.println("num1 + num2 = "+ (num1+num2));
    }
}

//operator overloading

