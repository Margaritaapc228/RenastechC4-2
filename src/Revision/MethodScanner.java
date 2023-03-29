package Revision;

import java.util.Scanner;

public class MethodScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");

        System.out.println(
                add(sc.nextInt(), sc.nextInt())
        );
    }
        static int add(int a, int b){
            return a + b;
        }

        static double subtract(double a, double b){
        return a-b;
        }
}
