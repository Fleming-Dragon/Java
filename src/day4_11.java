import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class day4_11 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int arr [] = new int[5];

        System.out.println("enter any 5 numbers");
        for(int i = 0 ; i < arr.length ; i ++ )
        {
            arr[i] = ip.nextInt();
        }

        for (int i : arr)
        {
            System.out.print(" " + i);
        }
    }
}
