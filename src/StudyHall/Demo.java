package StudyHall;

public class Demo {
    public static void main (String[] arg){

        /*
        WAP to check if a person can donate blood.
        A person can do it if age>=20 and weight is greater than 50
         */
       int age=35, weight=95;
       if (age>=20 && weight>=50) System.out.println("You can donate blood");
       else System.out.println("You can not donate blood");
    }
}

