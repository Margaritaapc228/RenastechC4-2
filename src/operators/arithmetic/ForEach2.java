package operators.arithmetic;

import java.util.Scanner;

public class ForEach2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");

        int[] a= new int[5];
        for (int i=0; i<a.length; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Entered elements are");
        for (int i: a){
            System.out.print(i+" ");
        }
    }
}
