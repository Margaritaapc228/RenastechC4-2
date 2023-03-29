package operators.arithmetic;

public class UnaryOperators {
    public static void main (String [] args){

        // Unary plus and Unary minus operators
        int i = 10;
        System.out.println(i);
        int j = -20;
        System.out.println(j);
        int k = +30;
        System.out.println(k);
        System.out.println(10 - -10);
        i = -20 + +6 * -2;
        System.out.println(i);

        //Unary increment
        int a;
        a = 5;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);

        int r = 5;

        int t = ++r;

        System.out.println(t);

        t=r++;
        System.out.println(t);
        System.out.println(r);



        //Unary decrement
        System.out.println(a);
        a--;
        System.out.println(a);
        --a;
        System.out.println(a);



    }
}
