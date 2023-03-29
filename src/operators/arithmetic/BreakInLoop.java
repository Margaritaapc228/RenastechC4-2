package operators.arithmetic;

public class BreakInLoop {
    public static void main(String[] args) {

       /* for (int i=0; i<=20; i++){
            if (i==6)
                break;
            System.out.println(i);}*/

        int n=8;
        for (int i=1; i<n; i++){
            System.out.println(i+"/"+ (i+1));
        }
    }
}
