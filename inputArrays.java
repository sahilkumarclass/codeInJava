//package sahil.com
import java.util.*;
public class inputArrays {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int number[] = new int[size];
        //input
        for (int i = 0; i < size; i++){
            number[i] = input.nextInt();
        }
        //output
        for(int i = 0; i < size; i++){
            System.out.println(number[i]);
        }
    }
}
