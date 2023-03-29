package operators.arithmetic;

public class IfElse2 {
    public static void main(String[] args) {

      /* int salary = 100000;
        if (salary<=10000)System.out.println("go to Park");
        else {
            if (salary <= 50000) System.out.println("go to California");
            else {
                if (salary <= 90000) System.out.println("go to Europa");
                else System.out.println("go on a World Tour");

            }
--------------------------------------------------------------------
            WAP to print the greater of the two given number
            WAP to print the smaller of the two given numbers
            WAP to print the greater of the three given number
            WAP to print the smaller of the three given numbers
        }*/

        int a=100, b=20, c=30;
        if (a<b && a<c) System.out.println(a + " is the smallest");
        else if (b<a && b<c) System.out.println(b + " is the smallest");
        else System.out.println(c + " is the smallest");


    }
}
