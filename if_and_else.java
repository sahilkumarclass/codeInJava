//                                //Even and Odd
////package com.sahil;
//import java.util.*;
//public class if_and_else {
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        long x = input.nextLong();
//        if(x % 2 == 0)
//        {
//            System.out.println(x + " is Even Number!");
//        }
//        else
//        {
//            System.out.println(x + " is Odd Number!");
//        }
//    }
//}
//                                Greater and Smaller

////package com.sahil;
//import java.util.*;
//public class if_and_else{
//    public static void main(String[] args)
//    {
//        System.out.print("Enter a Number_1: ");
//        Scanner input = new Scanner(System.in);
//        int Number_1 = input.nextInt();
//        System.out.print("Enter a Number_2: ");
//        int Number_2 = input.nextInt();
//        if(Number_1 == Number_2)
//        {
//           System.out.println(Number_1 + " Equal to " + Number_2);
//        }
//        else {
//            if(Number_1 > Number_2)
//            {
//                System.out.println(Number_1 + " Greater then " + Number_2);
//                System.out.println("Max Number: " + Number_1);
//            }
//            else {
//                System.out.println(Number_1 + " Smaller than " + Number_2);
//                System.out.println("Max Number: " + Number_2);
//            }
//        }
//    }
//}
                            //Same Code With else-if
////package com.sahil;
//import java.util.*;
//public class if_and_else{
//    public static void main(String[] args)
//    {
//        System.out.print("Enter a Number_1: ");
//        Scanner input = new Scanner(System.in);
//        int Number_1 = input.nextInt();
//        System.out.print("Enter a Number_2: ");
//        int Number_2 = input.nextInt();
//        if(Number_1 == Number_2)
//        {
//            System.out.println(Number_1 + " Equal to " + Number_2);
//        }
//        else if(Number_1 > Number_2)
//        {
//                System.out.println(Number_1 + " Greater then " + Number_2);
//                System.out.println("Max Number: " + Number_1);
//                System.out.println("MIN Number: " + Number_2);
//        }
//        else {
//                System.out.println(Number_1 + " Smaller than " + Number_2);
//                System.out.println("Max Number: " + Number_2);
//                System.out.println("Min Number: " + Number_1);
//        }
//    }
//}

//package com.sahil;
import java.util.*;
public class if_and_else {
    public static void main(String[] args) {
        System.out.print("Enter a Your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible for voting");
        } else {
            System.out.println("you are not eligible for voting");
        }
    }
}