package Revision;

public class IfElse3 {
    public static void main(String[] args) {

        /*
        Number     Word
        50-60     mango
        65-98     orange
        10-40     red
         */
        int number =45;

        if (number>=50 && number<=60) System.out.println("mango");
        else if (number>=65 && number<=98) System.out.println("orange");
        else if (number>=10 && number<=49) System.out.println("red");

    }
}
