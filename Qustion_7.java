//package sahil.com;
import java.util.*;
public class Qustion_7 {
    public static void main(String[] args){
        int Sum = 0, a = 1, b = 2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
        int n = input.nextInt();
        for(int i = 0; i <= n ; i++){
            Sum += i;

        }
        System.out.println(Sum);
    }
}
