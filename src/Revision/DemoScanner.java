package Revision;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
       /* System.out.println("Enter a word");
        String word = sc.next();
        System.out.println(word);
        sc.nextLine();

        System.out.println("Enter the address");
        String name = sc.nextLine();
        System.out.println(name);

       // System.out.println("Enter a character");

        String str = "Hello";
        char ch= str. charAt(1);
        System.out.println(ch);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        int len = str.length();
        System.out.println(str.length());*/

        System.out.println("Enter a string");
        String str = sc.nextLine();

        for (int j=0; j<str.length();j++ ){
            System.out.println(str.charAt(j));
        }

        System.out.println(str.length());
    }
}
