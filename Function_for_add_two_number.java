//package sahil.com;

                        // Sum of 2 Number
import javax.print.attribute.standard.NumberUp;
//import java.util.*;
//public class Function_for_add_two_number {
//    public static int sumOfTowNumber(int Number_1, int Number_2){
//        return Number_1 + Number_2;
//    }
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Number_1: ");
//        int Number_1 = input.nextInt();
//        System.out.print("Enter a Number_2: ");
//        int Number_2 = input.nextInt();
//        int sum = sumOfTowNumber(Number_1, Number_2);
//        System.out.print("The Sum Of Two Number is : " +sum);
//        input.close();
//    }
//}
import java.util.*;
public class Function_for_add_two_number {
private static int sum = 0;
    public static void sumOfTwoNumber(int Num_1, int Num_2)
    {
        sum = Num_1 + Num_2;
//        return sum;
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number_1: ");
        int Number_1 = input.nextInt();
        System.out.print("Enter a Number_2: ");
        int Number_2 = input.nextInt();
        sumOfTwoNumber(Number_1, Number_2);
        System.out.println("The Sum Of Two Numbers is: " + sum);
        input.close();
    }
}