////package sahil.com
//import java.util.*;
//public class Qustion_6
//{
//    public static void main(String[] args)
//    {
//        int count = 0;
//        System.out.print("Enter a Number: ");
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int reverse = 0, remainder;
//        while(n != 0)
//        {
//            remainder = n % 10;
//            reverse = reverse * 10 + remainder;
//        }
//        System.out.println(reverse);
//        int temp = reverse;
//        while(temp != 0)
//        {
//            temp /= 10;
//            count++;
//        }
//        int div = (int)Math.pow(10, count-1);
//        System.out.println("Vertical:");
//        while(div != 0)
//        {
//            int q = reverse / div;
//            System.out.println(q);
//            reverse %=  div;
//            div /= 10;
//        }
//    }
//}



import java.util.Scanner;

public class Qustion_6 {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int reverse = 0, remainder;

        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }

        System.out.println("Reverse: " + reverse);

        int temp = reverse;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int div = (int) Math.pow(10, count - 1);

        System.out.println("Vertical:");

        while (div != 0) {
            int q = reverse / div;
            System.out.println(q);
            reverse = reverse % div;
            div /= 10;
        }
    }
}

