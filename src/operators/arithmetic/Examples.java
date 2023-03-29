package operators.arithmetic;

public class Examples {
    public static void main(String[] args) {

        /*int i = 1;
        int r = ++i + i++ + ++i + ++i + i++;
        System.out.println(r);
        System.out.println(i);*/

        int i = 1;
       /* int r = --i + i++ + i++ - i-- - ++i;

        System.out.println(r);
        System.out.println(i);*/

        int r = ++i + i-- - i++ + --i;
        System.out.println(r);
        System.out.println(i);
    }
}
