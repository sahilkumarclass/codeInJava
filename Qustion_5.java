//package sahil.com
import java.util.*;
public class Qustion_5
{
    public static void main(String[] args)
    {
        int count = 0;
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        while(temp != 0)
        {
            temp /= 10;
            count++;
        }
        int div = (int)Math.pow(10, count-1);
        while(div != 0)
        {
            int q = n/div;
            System.out.println(q);
            n = n % div;
            div /= 10;
        }
    }
}
