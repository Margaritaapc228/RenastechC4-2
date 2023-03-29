package OOPS;

public class Inheritance7 {
    public static void main(String[] args) {
        //below cll runs the show of the child class
        Evlat7 e = new Evlat7();
        e.show();

    }
}
class Baba7{
    //overridden method
    void show(){
        System.out.println("Hello");
    }
}
class Evlat7 extends Baba7{
    //overriding method Or Override
    void show(){
        System.out.println("Hi");
    }
}

// overriding
//it involves 2 methods
//overriding one in the child class
//overridden in the parent class

