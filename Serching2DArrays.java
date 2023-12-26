import java.util.*;
public class Serching2DArrays {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Row: ");
        int row = input.nextInt();
        System.out.print("Enter a Column: ");
        int cols = input.nextInt();
        int arr[][] = new int[row][cols];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter a number to serch: ");
        int x = input.nextInt();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                if(arr[i][j] == x){
                    System.out.print(x + " Found at location  (" + i + " , " + j + ")");
                }
            }
        }
    }
}
