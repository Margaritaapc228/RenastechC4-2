package operators.arithmetic;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        s= sc.next() + " slaw" + " salam";
        System.out.println(s);

        System.out.println(
                s=sc.nextInt()*sc.nextInt()+ "Yas"+"No"
        );
        System.out.println(s);
    }
}
