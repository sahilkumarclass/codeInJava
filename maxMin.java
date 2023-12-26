//package sahil.com
//import java.util.*;
//
//public class maxMin {
//    public static void main(String args[]){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a size of Arrays: ");
//        int size = input.nextInt();
//
//        int number[] = new int[size];
//        for(int i = 0; i < size; i++){
//            System.out.println("Enter a Number: ");
//            number[i] = input.nextInt();
//        }
//        int max = Integer.MIN_VALUE; // Corrected initialization
//        int min = Integer.MAX_VALUE; // Corrected initialization
//        for(int i = 0; i < number.length; i++){
//            if(number[i] < min){
//                min = number[i];
//            }
//            if(number[i] > max){
//                max = number[i];
//            }
//        }
//        System.out.println("Largest number is: " + max);
//        System.out.println("Smallest number is: " + min);
          //  input.close();
//    }
//}
import java.util.*;
import java.util.Arrays;
public class maxMin {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Size of arr: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter a Number: ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The min Value in arr is: " + arr[0]);
        System.out.print("The max value in arr is: " + arr[size - 1]);
        input.close();
    }
}