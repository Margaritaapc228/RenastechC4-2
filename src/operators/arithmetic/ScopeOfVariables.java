package operators.arithmetic;

public class ScopeOfVariables {
    public static void main(String[] args) {

        System.out.println("something");

        {
            System.out.println("inside");
            int i = 10;
            System.out.println(i);
        }
        int i =20;
        System.out.println(i);
        if ('a' != 'b')
            System.out.println("outside of block");
    }
}

