import java.util.*;
public class input {
    public static void main(String[] args)
    {
        int i = 12;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(input.nextLine());// when we use int and string both in code;
        System.out.print("Enter a String: ");
        String name = input.nextLine();
        int Sum = i + n;
        System.out.println(name);
        System.out.println(Sum);
    }
}



// import java.util.Scanner;

// public class Solution{
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);

//         System.out.println("================================");

//         for(int i = 0; i < 3; i++){
//             String s = input.next();
//             int n = input.nextInt();

//             System.out.printf("%-15s%03d\n", s, n);
//         }

//         System.out.println("================================");
//     }
// }


//import java.util.Scanner;
//
//public class input {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1 = sc.nextLine();
//            int x = sc.nextInt();
//            //Complete this line
//            System.out.printf("%-15s%03d\n", s1, x);
//        }
//        System.out.println("================================");
//
//    }
//}
