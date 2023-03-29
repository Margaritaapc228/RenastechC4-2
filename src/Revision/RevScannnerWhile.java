package Revision;

import java.util.Scanner;

public class RevScannnerWhile {

    public static void main(String[] args) {
        char option;
        do {

            float english, math, science, history, computers;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks out of 100 for the following subjects");
            System.out.print("English: ");
            english = sc.nextFloat();
            System.out.print("Maths: ");
            math = sc.nextFloat();
            System.out.print("Science: ");
            science = sc.nextFloat();
            System.out.print("History: ");
            history = sc.nextFloat();
            System.out.print("Computers: ");
            computers = sc.nextFloat();

            byte count = 0;
            if (english < 33) count++;
            if (math < 33) count++;
            if (science < 33) count++;
            if (history < 33) count++;
            if (computers < 33) count++;

            if (count >= 1) {
                System.out.println("The student is failing in " + count + " subjects");
            } else System.out.println("PASS");
            System.out.println("Press y to continue or any other key to stop");

            option = sc.next().charAt(0);
        } while (option =='y'|| option =='Y');
        System.out.println("Thanks for using");
    }
}
