package Revision;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class MethodDemo3 {
   /* public static void main(String[] args) {
        System.out.println(add(5.2,1.1));
        //error as parrot does not return any value
        // System.out.println(parrot(););
        parrot();
        return;
    }

    static void parrot(){
        System.out.println("Konk konk!!");
    }

    static double add(double a, double b){
        System.out.println("Jay-Z");
        return a+b;
    }*/
    //___________________________________________

   /* public static void main(String[] args) {

        System.out.println(    m1(    new String("Hello ")     )     );
    }

    static String m1(String s){
        return s+100;
    }*/
    //___________________________________________

    public static void main(String[] args) {
        System.out.println("Hello");
        show();
        System.out.println(show());

        //return keyword means method is supposed to terminate at this point
        return;

       // System.out.println();
       // int i;//error: unreachable statement
    }

    static char show(){
        return 65;
    }
}
