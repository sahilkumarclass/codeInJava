////package cam.sahil
//import java.util.*;
//import java.util.stream.IntStream;
//public class Qustion_2
//{
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a Number: ");
//        int n = input.nextInt();
//        System.out.println("Enter a Number: ");
//        int t = input.nextInt();
//        IntStream intStream = IntStream.range(n, t);//in boild funtion in java for range;
//        intStream.forEach(System.out::println);
//    }
//}

//package cam.sahil
import java.util.*;
import java.util.stream.IntStream;
public class Qustion_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int low_number = input.nextInt();
        System.out.print("Enter a Number: ");
        int high_number = input.nextInt();
        for(int i = low_number; i <= high_number; i++)
        {
            int count = 0;
            // try to divide n and increase count.
            for(int div = 2; div*div <= i; div++)//div*div for root
            {
                if(i % div == 0)
                {
                    count ++;
                    break;
                }
            }
            if(count == 0)
            {
               System.out.println(i);
            }
            else
            {
                System.out.println("Non-Prime Number are: " +i);
            }
        }
    }
}
