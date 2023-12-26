import java.util.*;
public class RecursionQuestion {
    public static int printXPow(int x, int n){
        if(x == 0){//base case 1;
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int result1 = printXPow(x , n - 1);
         int result = x * result1;
         return result;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value of x: ");
        int x = input.nextInt();
        System.out.print("Enter a value of n: ");
        int n = input.nextInt();
        int ans = printXPow(x, n);
        System.out.print(ans);
        input.close();
    }
}
