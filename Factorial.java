//package sahil.com;
//import java.util.*;
//public class Factorial {
//    public static void main(String[] args){
//        int factorial = 1;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int Number = input.nextInt();
//        for(int i = Number; i >= 1; i--){
//            factorial = factorial * i;
//        }
//        System.out.println("The Factorial is : " + factorial);
        //input.close();
//    }
//}
                            //By using function

//import java.util.*;
//public class Factorial {
//    public static void factorial(int Number){
//        if(Number < 0){
//            System.out.print("Invalid Number");
//            return;
//        }
//        int factorial = 1;
//        for(int i = Number; i >= 1; i--){
//            factorial = factorial * i;
//        }
//        System.out.print("The Factorial is : " + factorial);
//        return;
//    }
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int Number = input.nextInt();
//        factorial(Number);
//    }
//      input.close();
//}

                        //advace java
import java.util.*;

public class Factorial {
    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Invalid Number: Factorial is not defined for negative numbers.");
        }

        int factorial = 1;
        for (int i = number; i >= 1; i--) {
           // factorial = factorial * i;
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid input: Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(number);
            System.out.println("The Factorial is: " + result);
        }
        input.close();
    }
}
