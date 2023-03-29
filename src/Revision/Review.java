package Revision;

import java.util.Arrays;

public class Review {
    public static void main(String[] args) {

    int [] numbers = {2,5,3,1};
    String [] names= {"Maggie","Yanet","Eric"};
    char [] letters= {'a','b','c','d'};

    for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();

    Arrays.sort(numbers);
    Arrays.sort(names);
    Arrays.sort(letters);

    for (int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+ " ");
    }
    System.out.println("\nUsing Arrays.sort method...");
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(names));
    System.out.println(Arrays.toString(letters));

        System.out.println(
                concatenation("Hello", "world")
        );
        System.out.println(
                concatenation("Hello", "Java", "World")
        );

    }
    public static String concatenation(String str1, String str2){
        return str1.concat(" "+ str2);
    }
    public static String concatenation(String str1, String str2, String str3){
        return str1.concat(" "+ str2).concat(" "+str3);
    }
}
