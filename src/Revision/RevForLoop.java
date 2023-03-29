package Revision;

public class RevForLoop {
    public static void main (String [] args){

        int n = 8;
        //every number has at least 2 factors
        //first is the number itself
        //second is number 1
        boolean isPrime = true;
        for (int i=2; i<n; i++ ){
            if (n%i == 0){
                isPrime = false;
            }
        }
        if (isPrime) System.out.println("Prime Number");
        else System.out.println("Not Prime");

    }
}
