                                            //FibonacciExample1
//package sahil.com;
import java.util.*;
public class Qustion_3 {
    public static void main(String[] args)
    {
        int a = 0, b = 1, c;
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.println(a);
//            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
