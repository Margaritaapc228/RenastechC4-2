package operators.arithmetic;

import java.util.Scanner;

public class ArrayDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of a double array:");
        int size = sc.nextInt();
        System.out.println("Enter double values for the array:");
        double values[] = new double[size];
        for (int i=0; i< values.length; i++){
            values[i]= sc.nextDouble();
        }
        System.out.println("Entered double values are:");
        double total = 0;
        for (int i=0; i< values.length; i++){
            System.out.println(values[i]);
            total += values[i];
        }

        System.out.println("Total is "+ total);
        System.out.println("Average is "+ (total/size));
    }
}
