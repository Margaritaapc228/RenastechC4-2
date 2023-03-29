package Revision;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        while (true){
           int num= sc.nextInt();
            if (num==-1){
                System.out.println("Good Bye");
                break;
            }
            System.out.println(num + " is entered");

        }
    }
}
