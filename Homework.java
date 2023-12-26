//package sahil.com;
import java.util.*;
public class Homework {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter a number: ");
        int b = input.nextInt();
        System.out.print("Enter Operation to perform: ");
//        char Calculation = input.nextLine();
        //The nextLine() method of the Scanner class reads the whole line including the newline character ('\n') at the end when the user presses Enter after entering the second number. In this case, you want to read a single character for the operation, so using nextLine() is incorrect.
        //To fix this error, you can use the next() method instead, which reads only the next token (in this case, a single character) and ignores the newline character. Modify the line as follows:
        //This change will read a single character from the input and assign it to the variable Calculation.
        char Calculation = input.next().charAt(0);
        int sum , sub, div, mult, mod;
        switch (Calculation){
            case '+' :
                sum = a + b;
                System.out.print("Sum is : " + sum);
                break;
            case '-' :
                sub = a - b;
                System.out.print("Sub is : " + sub);
                break;
            case '*' :
                mult = a * b;
                System.out.print("Mult is : " + mult);
                break;
            case '/' :
                if(b == 0){
                    System.out.print("Invalid Division");
                }
                else {
                    div = a / b;
                    System.out.print("Div is : " + div);
                }
                break;
            case '%' :
                if(b == 0){
                    System.out.print("Invalid Division");
                }
                else {
                    mod = a % b;
                    System.out.print("Mod is : " + mod);
                }
                break;
            default:
                System.out.print("Invalid Operation!");
        }
    }
}
