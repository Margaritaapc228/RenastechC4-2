package OOPS;

public class Inheritance10 {

    public static void main(String[] args) {
        Child3 c = new Child3();
        c.show();
        c.showA();

        //super and this keyword are not allowed in the static methods
    }
}
class Base2{
    int a=10;
    void show(){System.out.println("Hello");}
}

class Child3 extends Base2{
    int a=20;
    void showA(){
        int a = 30;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    void show (){System.out.println("Hi"); super.show();}
}

