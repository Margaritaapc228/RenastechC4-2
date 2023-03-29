package operators.arithmetic;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******Even/Odd check******");

        char ch='y';
        while (ch=='y'){
            System.out.println("Enter a number");
            int i = sc.nextInt();
            if (i % 2 == 0) System.out.println(i +" is even");
            else System.out.println(i+" is odd");
            System.out.println("Enter \"y\" to continue or any other key to stop");
            ch = sc.next().charAt(0);
        }
        System.out.println("Thanks for using!!");
    }
}
