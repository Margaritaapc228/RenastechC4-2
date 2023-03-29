package Revision;

import java.util.Scanner;

public class RevScanner {
    public static void main(String[] args) {

        //scanner is a reference data type as it is a class
        //scan: and object reference variable OR reference OR reference variable
        Scanner sc = new Scanner(System.in);
        //using the object reference os the scanner class
        //in build methods of scanner class can be called

        System.out.println("Enter a number");
       /* if (sc.hasNextInt()) {
            int value = sc.nextInt();
            System.out.println("Entered number is: " + value);
        }
        else {
            System.out.println("No. entered is not a valid int");
        }*/
        while (!sc.hasNextInt()){
            System.out.println("Please enter a valid number");
            sc.nextLine();
        }
        int value = sc.nextInt();
        System.out.println("Entered int value is : "+ value);
    }
}
