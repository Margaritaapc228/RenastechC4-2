package operators.arithmetic;

public class Assignment {

    public static void main(String[] args) {

        int i = 365, sum = 0;
        int digit1 = i%10;
        int new_number = i/10;
        int digit2 = new_number%10;
        new_number = new_number/10;
        int digit3 = new_number%10;

        sum = digit1 + digit2 + digit3;
        System.out.println("Sum of " + digit3 + "+"+ digit2 + "+"+ digit1 + "=" + sum);

        int a = 10;
        a = a + 10;
        System.out.println(a);

        a = a * a + 2;
        System.out.println(a);


        int b = 5;
        b = 9 + 6 / b;
        System.out.println(b);

    }

}
