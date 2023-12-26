import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        //CONCATENATION
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        //SIZE OF STRING
        System.out.println(fullName.length());
        //charAt
        for(int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        //compreTo of string
        //1 s1 > s2: +ve value;
        //2 s1 == s2: 0 value;
        //3 s1 < s2: -ve value;
        if(firstName.compareTo(lastName) == 0){
            System.out.print("String are same");
        }
        else{
            System.out.println("String are diffrent");
        }
        //substring;
        String sub = fullName.substring(6, fullName.length());
        System.out.print(sub);
        String sub1 = fullName.substring(6);
        System.out.print(sub1);
        input.close();
    }
}
