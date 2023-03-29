package operators.arithmetic;

import java.util.Scanner;

public class Arrayfloat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float temp[] = new float[10];


       /* System.out.println("Enter a temperature of tem[0]: ");
        temp[0]= sc.nextFloat();
        System.out.println("Entered temperature is : "+ temp[0]);*/

        System.out.println("Enter the temperature of 10 cities ");
        for (int i=0;i< temp.length; i++){
            temp[i] = sc.nextFloat();
        }
        System.out.println("Entered temperature are : ");

        for (int i=0; i< temp.length; i++){
            System.out.println(temp[i]);
        }
    }
}
