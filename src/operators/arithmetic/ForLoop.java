package operators.arithmetic;

public class ForLoop {
    public static void main(String[] args) {

       /* System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        //ITERATION (repetition): doing something again and again

        int n = 30000;
        for (int i = 1; i<=n; i++){
            System.out.println("Number= "+ i);
        }
        System.out.println(n);

        int n = 100;
        //even numbers
        for (int i=0; i<=n; i=i+2){
            System.out.println(i);
        }*/
        int n = 100;
        System.out.println("EVEN \t\"ODD");
        for (int i=0; i<=n; ++i ){
            System.out.println(i + "\t\t"+ ++i);
        }
    }
}
