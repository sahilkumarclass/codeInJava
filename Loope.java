//                  Printing 0 to 10.
//public class Loope {
//    public static void main(String[] args)
//    {
//        int x = 0;
//        while (x<=10)
//        {
//            System.out.println(x);
//            x++;
//        }
//        System.out.println("Done");
//    }
//}
//package cam.sahil;
//public class Loope{
//    public static void main(String[] args)
//    {
//        for (int x = 0; x <= 10; x++)
//        {
//            System.out.println(x);
//        }
//        System.out.println("Done");
//    }
//}
import java.util.*;
public class Loope{
    public static void main(String[] args)
    {
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int x = 0; x <= n; x++)
        {
            System.out.println(x);
        }
        System.out.println("Done");
    }
}