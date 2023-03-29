package Revision;

import java.util.Scanner;

public class ArrayRevision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter de dimensions od the 2-D array");
        int arr[][] = new int[sc.nextInt()][sc.nextInt()];

        System.out.println("Enter de elements of the array");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Entered array is:");
        for (int i=0; i< arr.length; i++){
            for (int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        int small=arr[0][0];
        int large=arr[0][0];

        for (int i=0; i<arr.length;i++){
            for (int j=0; j< arr[i].length; j++){
                if (arr[i][j]<small) small=arr[i][j];
                if (arr[i][j]>large) large=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Smallest = "+ small);
        System.out.println("Largest = "+ large);

    }
}
