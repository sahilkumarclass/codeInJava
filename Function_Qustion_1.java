//package sahil.com;
import java.util.*;
public class Function_Qustion_1 {
    public static int calculatingProduct(int Number_1, int Number_2){
        return Number_1 * Number_2;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number_1: ");
        int Number_1 = input.nextInt();
        System.out.print("Enter a number_2: ");
        int Number_2 = input.nextInt();
        int Multiplycation = calculatingProduct(Number_1, Number_2);
        System.out.print("The Multiplycation is : " + Multiplycation);
        input.close();
    }
}
