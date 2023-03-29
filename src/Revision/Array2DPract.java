package Revision;

import java.util.Scanner;

public class Array2DPract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter de no. of rows of the_array");
        int row = sc.nextInt();
        System.out.println("Enter de no. of columns of the_array");
        int colum = sc.nextInt();
        int arr[][]= new int[row][colum];

        System.out.println("Enter the elements of the array:");
        for (int i=0;i<arr.length; i++){
            for (int j=0;j< arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered array is :");
        for (int i=0;i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
