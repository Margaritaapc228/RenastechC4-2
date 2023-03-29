package operators.arithmetic;

import com.sun.tools.corba.se.idl.StructEntry;

public class LogicalOperators {
    /*
    BOOLEAN LOGICAL OPERATORS (Binary operators)
    ------------------------
    && Boolean AND operator: will evaluate to true
    //of both the conditions are true.
    || Boolean OR operator: will evaluate to true
    //if ata least one condition is true otherwise it will evaluate false.
    ! Boolean INVERT/NOT operator
     */
    public static void main(String[] args) {
      /*  System.out.println(10.5>6);
        System.out.println('n'=='n');
        System.out.println("hello"=="hellO");*/

         //  && Boolean AND operator: will evaluate to true
        //of both the conditions are true.
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        //|| Boolean OR operator: will evaluate to true
        //    //if ata least one condition is true otherwise it will evaluate false.
        System.out.println(true || false);
        System.out.println(10<9 || 5>6);
        System.out.println(false || false);
        System.out.println(true || false && true);

        System.out.println(
                true || (true && false) && (6*6==30+6) || true
        );

        System.out.println(!true);
        System.out.println(!false);

        System.out.println(true || false && !false);

    }
}
