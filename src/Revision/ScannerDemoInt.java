package Revision;

import java.util.Scanner;

public class ScannerDemoInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Int number");

        //if is false
        while (!sc.hasNextInt()) {
            String str=sc.nextLine();
            System.out.println("Entered string is :" + str);
            System.out.println("Enter a valid number:");
        }
        System.out.println("Thanks for entering a valid int number");
            int i = sc.nextInt();
            System.out.println("Entered number is: " + i);
    }
}
