package operators.arithmetic;

public class StringConcat {
    public static void main(String[] args) {
        /*
        String concatenation
        + operator
        concat method
         */

        String s1 = "snow" + "ball";
        System.out.println(s1);

        System.out.println("new" + "york" + "is very cold");

        String s2 = "fair".concat("play");
        System.out.println(s2);

        System.out.println(10 + 20 + "30");//3030
        System.out.println(10 + 20 + "30" + 10 + 10);//30301010
    }
}
