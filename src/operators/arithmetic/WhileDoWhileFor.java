package operators.arithmetic;

public class WhileDoWhileFor {
    public static void main(String[] args) {

        //using while
        int j=1;
        while (j<=5){
            System.out.print(j++);
        }
        System.out.println("\n");
         //using for loop
        for (int i=1; i<=5; i++){
            System.out.print(i);
        }
        System.out.println("\n");
        //using do while loop
        int m=1;
        do{
            System.out.print(m++);
        }while (m<=5);




    }
}
