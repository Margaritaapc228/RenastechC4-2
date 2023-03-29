package OOPS;

public class Inheritance12 {
    Inheritance12(){
        System.out.println("Helllo");
    }

    Inheritance12(int a){
        this("slaw");
        System.out.println("Hi");
    }
    Inheritance12(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {

        new Inheritance12(10);
        new Inheritance12("Hello Java Word");
        new Inheritance12();
    }
}