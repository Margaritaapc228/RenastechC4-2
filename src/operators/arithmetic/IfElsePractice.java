package operators.arithmetic;

public class IfElsePractice {

    public static void main(String[] args) {

       /* Points    Grates
         91-100       A
         75-90        B
         60-74        C
         40-59        D
         <40          E


        int points = 35; char grade = 'E';
        if (points>=91) grade = 'A';
        else if (points >= 75) grade = 'B';
        else if (points >= 60) grade = 'C';
        else if (points >= 40) grade = 'D';
        else if (points <= 40) grade = 'E';

        System.out.println(grade);*/

        /*
        Age    Advice
        0-5    get love
        6-10   play
        11-20  study
        21-60  work
        >60    retired and pray to god
         */
        int age=75;
        if (age<=5) System.out.println("Get love");
        else if (age<=10) System.out.println("play");
        else if (age<=20) System.out.println("study");
        else if (age<=60) System.out.println("work");
        else if (age>60) System.out.println("retired and pray to god");
    }
}
