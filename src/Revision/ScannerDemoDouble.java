package Revision;

import java.util.Scanner;

public class ScannerDemoDouble {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to be checked");
        while (sc.hasNextDouble()){
            System.out.println("You have entered a valid double value ");
            System.out.println("Scanning the entered value and putting it in a variable");
            double d = sc.nextDouble();
        }
        System.out.println("Invalid data entered");
    }
}
