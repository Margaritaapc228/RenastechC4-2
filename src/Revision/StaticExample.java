package Revision;

public class StaticExample {

    //static variables are also called class variables
    static int j = 20;
    int i= 10;
    public static void main(String[] args) {
        new StaticExample(). show();
        System.out.println(++j);
        int k = 30;//stack area
    }

    void show(){
        System.out.println("hi");
    }

    static  int m1(){
        return 10;
    }

    StaticExample(){
        System.out.println("Hello");
    }
}

