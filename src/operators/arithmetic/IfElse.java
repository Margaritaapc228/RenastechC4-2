package operators.arithmetic;

public class IfElse {
    public static void main(String[] args) {

       // int i=5, j=2;
        /*if (j<40) i++;
        if (j>=50) i = 6+i;

        if (j==50){
            ++i;
            j=j+i;
        /

        if (i==j)
            i = i + j;
        else
            i = ++i +j;*/
        int i=5, j=2;

        if (i*j>=10) {
            i++; j--;
            int r = i*j;
            System.out.println(r*r );

        }
        else {
            int r = ++i * --j;
            System.out.println(r);
        }

        System.out.println(i + "\n" + j);
    }
}
