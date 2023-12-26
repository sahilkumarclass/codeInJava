import java.util.*;
//public class StringBuildersQustion {
//    public static void main(String args[]){
//        StringBuilder sb = new StringBuilder("Sahil");
//        for(int i = sb.length() - 1; i >= 0; i--){
//            System.out.println(sb.charAt(i));
//        }
//    }
//}
//
//Best Approach solving this Qustion becase time taken is O(n/2);
public class StringBuildersQustion {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("HelloWorld");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }
}
