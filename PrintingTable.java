////package sahil.com;
//import java.util.*;
//public class printing_table {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Number: ");
//        int n = input.nextInt();
//        for(int i = 1; i <= 10; i++){
//            System.out.println(i * n);
//        }
//        input.close();
//    }
//}


// code after formating


import java.util.*;

public class PrintingTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = input.nextInt();

        System.out.println("Number\t\t\tTable");
        System.out.println("-----------\t\t------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d\tX\t%d\t=\t%d\n", n, i, i * n);
        }

        input.close(); // Close the scanner after the loop
    }
}
