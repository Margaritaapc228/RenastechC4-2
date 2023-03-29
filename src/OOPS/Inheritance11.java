package OOPS;

public class Inheritance11 {
    public static void main(String[] args) {
        Child25 c = new Child25();
    }
}

class Dede2{
    Dede2(){super();System.out.println("Chao");}
}

class Base4 extends Dede2{
    Base4(){super();System.out.println("Hello");}
}

class Child25 extends Base4{
    Child25(){super();System.out.println("Hi");}

}