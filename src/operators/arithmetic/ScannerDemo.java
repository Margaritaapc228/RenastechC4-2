package operators.arithmetic;

import java.util.Scanner;

public class ScannerDemo {
    public static void main (String [] args){
        //to take data from user
       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Prog terminated");

        if (num>18) System.out.println("Hello");
        else System.out.println("Hi");*/

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.println("First number a: ");
        int a = sc.nextInt();
        System.out.println("Second number b: ");
        int b = sc.nextInt();
        System.out.println("the addition of a+b = " + (a+b));
        System.out.println("the subtraction of a-b = " + (a-b));
        System.out.println("the multiplication of a*b = " + (a*b));
        System.out.println("the division of a/b = " + (a/b));
        System.out.println("the modulus of a%b = " + (a%b));


    }
}
