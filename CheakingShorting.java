////package sahil.com;
//import java.util.*;
//public class cheakingShorting{
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//
//        //input
//        for(int i=0; i<size; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//
//        boolean isAscending = true;
//
//        for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
//            if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
//                isAscending = false;
//            }
//        }
//
//
//        if(isAscending) {
//            System.out.println("The array is sorted in ascending order");
//        } else {
//            System.out.println("The array is not sorted in ascending order");
//        }
//
//    }
//}
import java.util.*;
public class CheakingShorting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter number: ");
            arr[i] = input.nextInt();
        }
        boolean isAscending = true;
        for(int i = 0; i < size - 1; i++){
            if(arr[i] > arr[i + 1]){
                isAscending = false;
                break;
            }
        }
        if(isAscending){
            System.out.print("It is in Ascending Order");
        }
        else{
            System.out.print("It is not in Asecending Order");
        }
        input.close();
    }
}