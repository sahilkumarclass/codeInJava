import java.util.*;
public class Sorting{
    public static void printArrays(int arr[], int size){
        System.out.print("Arrays after sorting: ");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String agrs[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of arr: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter a Number: ");
            arr[i] = input.nextInt();
        }
        //BubbleSort
        //Time Complexity is O(n^2);
//        int count = 0;
//        while(count < size) {
//            for (int i = 0; i < size - 1 - count; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    //swap
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            count++;
//        }
        //selection sort;
        //time complexity is O(n^2);
//        for(int i = 0; i < arr.length - 1; i++){
//            int smallest = i;
//            for(int j = i + 1; j < arr.length; j++){
//                if(arr[smallest] > arr[j]){
//                    smallest = j;
//                }
//            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
        //insertion sort;
        for(int i = 0; i < arr.length; i ++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }

        printArrays(arr, size);
        input.close();
    }
}
