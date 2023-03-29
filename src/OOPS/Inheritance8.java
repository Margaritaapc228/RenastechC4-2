package OOPS;

public class Inheritance8 {
    public static void main(String[] args) {
        Base1 a = new Base1();
        a.show();
        new Child12(). show();
        //variable a hide the variable a Base
        System.out.println(new Child12().a);
    }
}

class Base1{
    int a=10;
    void show(){
        System.out.println("Hello");
    }
}

class Child12 extends Base1{
   // int a=20;
    int b=30;

    void show(){
        System.out.println("Hi");
    }
}
