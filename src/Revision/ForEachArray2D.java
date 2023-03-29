package Revision;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class ForEachArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[2][3];

        System.out.println("Enter de elements:");
        for (int[]a : arr){
            for (int i=0; i<a.length;i++){
                a[i]= sc.nextInt();
            }
        }
        System.out.println("Entered elements are");
        for (int [] a: arr){
            for (int i : a){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
