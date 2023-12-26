import java.util.*;
public class FactorialRecursion {
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = factorial(n);
        System.out.print(ans);
    }
}
