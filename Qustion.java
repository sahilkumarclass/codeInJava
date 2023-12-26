////package com.sahil;
//import java.util.*;
//public class Qustion {
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int t = input.nextInt();
//        for(int i = 1; i <= t; i++)
//        {
//            int count = 0;
//            System.out.print("Enter a Number: ");
//            int n = input.nextInt();
//            for(int div = 1; div <= n; div++){
//                if(n % div == 0)
//                {
//                    count++;
//                }
//            }
//            if(count == 2)
//            {
//                System.out.println("Prime Number!");
//            }
//            else
//            {
//                System.out.println("Not Prime Number!");
//            }
//        }
//    }
//}
                             // m-2
////package com.sahil;
//import java.util.*;
//public class Qustion {
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int t = input.nextInt();
//        for(int i = 1; i <= t; i++)
//        {
//            int count = 0;
//            System.out.print("Enter a Number: ");
//            int n = input.nextInt();
//            for(int div = 2; div * div <= n; div++){
//                if(n % div == 0)
//                {
//                    count++;
//                }
//            }
//            if(count == 0)
//            {
//                System.out.println("Prime Number!");
//            }
//            else
//            {
//                System.out.println("Not Prime Number!");
//            }
//        }
//    }
//}

                                //m-3
//package com.sahil;
import java.util.*;
public class Qustion {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int t = input.nextInt();
        for(int i = 1; i <= t; i++)
        {
            int count = 0;
            System.out.print("Enter a Number: ");
            int n = input.nextInt();
            for(int div = 2; div * div <= n; div++){
                if(n % div == 0)
                {
                    count++; // So, for time complecity.
                    break; // if any number is divided by any number until root n than it is not a prime.
                }
            }
            if(count == 0)
            {
                System.out.println("Prime Number!");
            }
            else
            {
                System.out.println("Not Prime Number!");
            }
        }
    }
}