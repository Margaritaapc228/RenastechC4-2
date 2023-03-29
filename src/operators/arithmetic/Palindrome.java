package operators.arithmetic;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int num, reverse=0, copy,last_digit;
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        copy = num;

        while (num>0){
            System.out.println("AN ITERATION");
            last_digit = num%10;
            System.out.println("last_digit: "+ last_digit);
            reverse=(reverse*10) + last_digit;
            System.out.println("reverse: "+ reverse);
            num=num/10;
            System.out.println("num: "+ num);
        }
        if (copy == reverse)
            System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");

    }

}
