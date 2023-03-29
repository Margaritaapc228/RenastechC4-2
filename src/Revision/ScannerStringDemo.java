package Revision;

import java.util.Scanner;

public class ScannerStringDemo {
    public static void main(String[] args) {

        System.out.println("Enter a string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.nextLine();
        System.out.println(str);

        System.out.println("Enter a string");
        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
