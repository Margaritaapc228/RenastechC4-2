package Revision;

import java.util.Arrays;
import java.util.Scanner;

public class FundamentalsRevision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of th array");
        int arr[]= new int[sc.nextInt()];

        System.out.println("Entered the elements of the array");
        for (int i=0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is :");
        System.out.println(Arrays.toString(arr));

        System.out.println("Using for each loop");
        for (int element : arr){
            System.out.println(element);
        }
    }
}
