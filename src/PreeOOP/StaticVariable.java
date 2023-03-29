package PreeOOP;

public class StaticVariable {

    int i = 25;//instance
    int n=10;//instance
    static int s = 100;// static variable: declared outside any method

    //init block
    {System.out.println("Namaste");}
    //static block
    static {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        StaticVariable object1 = new StaticVariable();
        new StaticVariable(60);
        System.out.println(s+j);
    }
    static int j=20;

    //a static block OR static initializer OR static initialization
    static {
        System.out.println("Hello");
    }

    //init block
    {
        System.out.println("slaw");
    }
    StaticVariable(int a){System.out.println(a);}
    StaticVariable(){System.out.println("chao");}
}
