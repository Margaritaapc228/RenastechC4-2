package Revision;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter the values of the array:");
        int value [] = new int[size];
        for (int i=0; i<size; i++){
            value[i] = sc.nextInt();
        }
        System.out.println("Entered values are:");
        for (int i=0; i<size; i++){
            System.out.println(value[i]);
        }
    }
}
