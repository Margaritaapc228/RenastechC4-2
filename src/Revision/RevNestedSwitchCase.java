package Revision;

public class RevNestedSwitchCase {
    public static void main (String [] args){

        String option = "fourth";
        switch (option){

            case "first": System.out.println("Hello");
            case "second": System.out.println("slav");
            case "third": System.out.println("chao"); break;
            case "fourth":
                int op = 2;
                switch (op){
                    case 1: System.out.println("play");
                    case 2: System.out.println("study");break;
                    case 3: System.out.println("sleep");
                }
        }
    }
}
