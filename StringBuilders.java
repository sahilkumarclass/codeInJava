//import java.util.*;
public class StringBuilders {
    public static void main(String args[]){
       // Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Sahil");
        System.out.println(sb);
        //char at index 0;
        System.out.println(sb.charAt(0));
        //set char at index 0;
        sb.setCharAt(0, 's');
        System.out.println(sb);
        //inset char at index 0;
        sb.insert(0,'S');
        System.out.println(sb);
        //delete the exta n;
        sb.delete(1,2);
        System.out.println(sb);
        //append String at last;
        sb.append(" Kumar");
        System.out.println(sb);
        System.out.print(sb.length());
    }
}
//user input in String Builders
//import java.util.Scanner;
//
//public class InputStringBuilder {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // Create a StringBuilder object
//        StringBuilder sb = new StringBuilder();
//
//        // Prompt the user for input
//        System.out.print("Enter a string: ");
//
//        // Read user input and append it to the StringBuilder
//        String userInput = input.nextLine();
//        sb.append(userInput);
//
//        // Display the content of the StringBuilder
//        System.out.println("StringBuilder content: " + sb.toString());
//
//        // Close the Scanner
//        input.close();
//    }
//}
