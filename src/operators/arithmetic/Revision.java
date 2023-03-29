package operators.arithmetic;

public class Revision {
    public static void main(String[] args) {
        // a name given to a class , a method or a variable is called an identifier

        /*
        3 Types os Operators
        1) Unary Operator: operator that act on one operand
        2) Binary Operator: operator that act on 2 operands
        3) Ternary operator: operator that act on 3 operands
        */

        /*System.out.println()
        - Subtraction
        + Addition
        * Multiplication
        / Division
        % Modulus- to get the remainder
        */

        int i = 10 - 2 * 5 / 5 + 3;
        System.out.println(i);
        System.out.println(10/2);
        System.out.println(10%2);
        System.out.println(1.0/2.0);
        System.out.println(1.0%2.0);


        int a = 10, b = 20, add, subtract, multiply, divide, modulus;
        add = a+b;
        subtract = a-b;
        multiply = a*b;
        divide = a/b;
        modulus = a%b;

        System.out.println("a+b= "+add);
        System.out.println("a-b= " +subtract);
        System.out.println("a*b= " + multiply);
        System.out.println("a/b= " +divide);
        System.out.println("a%b= " +modulus);

        a =2;
        System.out.println("Operator is : " +a +a);

        System.out.println(365/12);
        System.out.println(365%12);

        int g = 5;
        g = --g + g-- + ++g;
        System.out.println(g);
    }
}
