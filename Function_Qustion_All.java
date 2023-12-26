//import java.util.*;
//
//public class Function_Qustion_All {
//    public static float average(int Number_1, int Number_2, int Number_3) {
//        float average = 0;
//        average = (Number_1 + Number_2 + Number_3) / 3.0f; // Cast to float for accurate average
//        return average;
//    }
//
//    public static int sum(int Number_4) {
//        int sum = 0;
//        for (int i = 1; i <= Number_4; i++) {
//            if (i % 2 != 0) {
//                sum += i; // Calculate the sum of all numbers from 1 to Number_1
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Uncomment this section to calculate average of 3 numbers
//         System.out.print("Enter a Number_1: ");
//         int Number_1 = input.nextInt();
//         System.out.print("Enter a Number_2: ");
//         int Number_2 = input.nextInt();
//         System.out.print("Enter a Number_3: ");
//         int Number_3 = input.nextInt();
//         float averageResult = average(Number_1, Number_2, Number_3);
//         System.out.println("The Average is: " + averageResult);
//
//        // Uncomment this section to calculate the sum from 1 to the input number
//        System.out.print("Enter a Number: ");
//        int Number_4 = input.nextInt();
//        int sumOddNumber = sum(Number_4);
//        System.out.print("The Sum from 1 to " + Number_4 + " is: " + sumOddNumber);
//    }
//}

import java.util.*;
public class Function_Qustion_All {
    private static int sumOddNumber(int num) {
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: "); 
        int num = input.nextInt();
        int sum = sumOddNumber(num);
        System.out.print("The Sum of Odd Number form 1 to " + num + " is: " + sum);
        input.close();
    }
}
