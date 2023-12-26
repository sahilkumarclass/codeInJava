//package sahil.com
import java.util.*;
public class Qustion_4 {
    public static void main(String[] args)
    {
        long count = 0;
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        while(n != 0)
        {
            n /= 10;
            count++;
        }
        System.out.print("Number of dights: "+count);
    }
}
