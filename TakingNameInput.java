//package sahil.com;
import java.util.*;
public class TakingNameInput {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size of Arrays: ");
        int size = input.nextInt();
        input.nextLine(); // Consume the newline character

        String Name[] = new String[size];
        for(int i = 0; i < size; i++){
            System.out.println("Enter a Name: ");
             Name[i] = input.nextLine();
        }
        for(int i = 0; i < size; i++){
            System.out.println("The Name is: " + Name[i]);
        }
    }
}
