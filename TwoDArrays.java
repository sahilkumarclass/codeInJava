import java.util.*;
public class TwoDArrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int cols = input.nextInt();
        int arr[][] = new int [row][cols];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
