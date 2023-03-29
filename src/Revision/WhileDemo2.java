package Revision;

import java.util.Scanner;

public class WhileDemo2 {
    public static void main(String[] args) {


       /* char ch= 'y';int num;
        Scanner sc = new Scanner(System.in);

        while (ch == 'y'){
            System.out.println("Enter a number:");
            num =sc.nextInt();
            if (num>0) System.out.println("number is positive");
            else if (num<0) System.out.println("number is negative");
            else System.out.println("number is zero");

            System.out.println("do you want to continue? y/n");
            ch = sc.next(). charAt(0);
        }
        System.out.println("Thanks for using");*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer ");

        int i;boolean flag = true;

        while (flag) {
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                System.out.println("Entered number is " + i);
                break;
            }
            System.out.println("Invalid entry! Please enter again!!");
        }

    }
}
