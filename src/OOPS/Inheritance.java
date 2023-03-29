package OOPS;

public class Inheritance {

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.a);
        System.out.println(c.j);
        c.show();

    }
}
class  Parent{
    //instance variable or property
    int a = 10;
    //behaviour of the parent
    void show(){
        System.out.println("Hello");
    }
}

class Child extends Parent{
    int j = 20;
}

