//package sahil.con;
import java.util.*;
public class Function {
    //function defined
    public static void printMyName(String name){
        System.out.print("Name You Enter is: " + name);
        return;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();

        printMyName(name);//function call
        input.close();
    }
}
