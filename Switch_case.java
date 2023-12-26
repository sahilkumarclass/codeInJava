// package sahil.com
import java.util.*;
public class Switch_case {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int button = input.nextInt();
        switch (button){
            case 1 :
                System.out.print("Hello!");
                break;
            case 2 :
                System.out.print("Namaste!");
                break;
            case 3 :
                System.out.print("Bonjour!");
                break;
            default :
                System.out.print("Invalid Button!");
        }
    }
}
