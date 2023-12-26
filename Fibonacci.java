import java.util.*;
public class Fibonacci {
    public static void fibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        a = b;
        b = c;
        System.out.println(c);
        fibonacci(a, b, n - 1);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fibonacci(a, b, n - 2);
    }
}
