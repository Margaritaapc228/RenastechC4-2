package operators.arithmetic;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("String main");
        int[] numbers = {1,2,3,4};
        main(numbers);
    }

    public static void main(double[] args) {
        System.out.println("Double main");
    }

    public static void main(int[] args) {
      //  main(new double[]{1.2, 3.4, 5.6});
        System.out.println("Int main");
    }
}
