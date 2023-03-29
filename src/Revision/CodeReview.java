package Revision;

import java.util.Scanner;

public class CodeReview {
    public static void main(String[] args) {

       /* for (int i=0; i<=5; i++){
            for (int j=i; j<=5; j++){
                System.out.print(".");
            }
            System.out.println();
        }
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            for (int j=num; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
