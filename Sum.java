////package com.sahil;
//import java.util.Scanner; //Input Class
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a Number_1: ");
        float Number_1 = input.nextFloat();
        System.out.print("Enter a Number_2: ");
        float Number_2 = input.nextFloat();
        System.out.print("Enter a Number_3: ");
        float Number_3 = input.nextFloat();
        double Sum = Number_1 + Number_2 + Number_3;
        System.out.println("Sum of " + Number_1 + " , " + Number_2 + " and " + Number_3 + " = " + Sum);
        double Product = Number_1 * Number_2 * Number_3;
        System.out.println("Product of " + Number_1 + " , " + Number_2 + " and " + Number_3 + " = " + Product);
    }
}

