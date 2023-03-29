package operators.arithmetic;

import java.util.Scanner;

public class StringTypes {
    public static void main(String[] args) {

        //substring
      //  String str = "We the people of this World...";
        /*String s=str.substring(5);
        System.out.println(s);

        String s1 = str.substring(7,12);
        System.out.println(s1);*/

        //equals
        /*String s = "slav";
        System.out.println(s.equals("Slav"));
        System.out.println(s.equals("SLAV"));
        System.out.println(s.equalsIgnoreCase("SlaV"));*/

        String username = "proCoder";
        String password = "juT7%$";
        Scanner sc = new Scanner(System.in);
        System.out.println("Username:");
        String uName = sc.nextLine();
        System.out.println("Password:");
        String pass = sc.nextLine();

        if (uName.equalsIgnoreCase(username) && pass.equals(password)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Unsuccessful");
        }
    }
}
