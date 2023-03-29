package operators.arithmetic;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {

        String s = "Shell";

        String str = s.replace("Sh","p");
        System.out.println(s +"\n" +str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s2 = sc.nextLine();

        System.out.println(s2.replace('s','$'));
    }
}
