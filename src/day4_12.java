import java.util.Scanner;

public class day4_12 {
    public static void main(String[] args) {
        int arr [] = new int[5];

        Scanner ip = new Scanner(System.in);
        for (int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = ip.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum = arr[i] + sum;
        }

        System.out.println("The sum of Entered number is : " + sum) ;
    }
}
