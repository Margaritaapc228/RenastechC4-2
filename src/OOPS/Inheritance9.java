package OOPS;

public class Inheritance9 {
    public static void main(String[] args) {

        O o = new O();
        System.out.println(o.toString());
        System.out.println(new N().toString());
        System.out.println(new M().toString());
    }
}
class M{}

class N extends M{}

class O extends N{}
