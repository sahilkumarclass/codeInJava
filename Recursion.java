//import java.util.*;
//public class recursion {
//    public static void main(String args[]){
//        int i = 5;
//        printMyNumber(i);
//    }
//
//    private static void printMyNumber(int i) {
//        if(i == 0){
//           return;
//        }
//        System.out.println(i);
//        i--;
//        printMyNumber(i);
//    }
//}

public class Recursion {
    public static void main(String args[]){
        int i = 1;
        printMyNumber(i);
    }

    private static void printMyNumber(int i) {
        if(i == 6){
            return;
        }
        System.out.println(i);
        i++;
        printMyNumber(i);
    }
}