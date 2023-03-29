package OOPS;

public class Inheritance4{
    public static void main(String[] args) {
        Child1 c = new Child1();
        System.out.println(c.i+c.j+c.k);
    }
}
class Dede{int i=5;}
class Base extends Dede{int j=10;}
class Child1 extends Base{int k=20;}

