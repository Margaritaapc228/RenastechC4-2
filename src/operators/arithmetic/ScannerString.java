package operators.arithmetic;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter your city:");
      //  String city = sc.next();
       // System.out.println("You live in "+ city);

        //to print with spaces you need to used nextLine
       /* System.out.println("Enter your city:");
        String city2 = sc.nextLine();
        System.out.println("You live in "+ city2);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is "+ name);*/
        System.out.println("Enter a String:");
        String word = sc.nextLine();
        System.out.println("Enter a character to find its index;");
        char ch = sc.next(). charAt(0);

        if (word.indexOf(ch)== -1)
            System.out.println("Character '"+ ch+"' is not there");
        else System.out.println("Index of "+ ch + " is "+ word.indexOf(ch));


    }
}
