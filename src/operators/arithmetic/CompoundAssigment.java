package operators.arithmetic;

public class CompoundAssigment {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        i = i + 10 ;
        System.out.println(i);

        //+=compound assignment OR argument assignment
        i +=10;//short hand of i = i+10
        System.out.println(i);

        System.out.println(i-=20);

        int k =10;
        k*=10+20/2;
        System.out.println(k);
    }
}
