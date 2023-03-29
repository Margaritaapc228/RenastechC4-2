package PreeOOP;

public class StaticInstance4 {

    {System.out.println("Namaste");}
    static {System.out.println("Hello");}

    StaticInstance4(){System.out.println("Chao");}

    {System.out.println("Hi");}
    int i = 25;

    static int j=50;

    StaticInstance4(String s){System.out.println(s);}
    StaticInstance4(int p){System.out.println(p);}

    public static void main(String[] args) {
        new StaticInstance4();
        new StaticInstance4();
    }
}
