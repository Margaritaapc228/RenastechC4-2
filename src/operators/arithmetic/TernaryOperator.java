package operators.arithmetic;

public class TernaryOperator {
    public static void main(String[] args) {

       /* int i=10, j;
        if (i<9)
            j=1;
        else
            j=0;
        //j =i<9 ? 1: 0;
        System.out.println(j);

        int a=10;
        String s = (a<10) ? "a is less than 10" : "a is not less than 10";
        System.out.println(s);*/

        int a=10;
        /*if (a<10)
            s="a is less than 10";
        else{
            if (2000>a) s="2000 is greater than a";
            else s= "2000 is less than a";*/
        String s = (a<10) ? "a is less than 10":(2000>a) ? "2000 is greater than a":"2000 is less than a";

        System.out.println(s);

    }
}
