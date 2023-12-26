import java.util.*;
public class RecursionQustion {
    public static void sumOfNum(int n, int x, int sum){
        if(x > n){
            System.out.println("The sum of n natural numbers is: " + sum);
            return;
        }
        sum += x;
        x++;
        sumOfNum(n, x, sum);
    }
    public static void main(String agrs[]){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int x = 1;
        System.out.print("Enter a Number: ");
        int n = input.nextInt();
        sumOfNum(n, x, sum);
        input.close();
    }
}
