package Revision;

public class MethodsRevision {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s);

        show();
    }

    static void show(){
        dear(
                add(5,6)
        );
        System.out.println("show");
    }
    static int add(int a, int b){
        return a+b;
    }

    static void dear(int n){
        System.out.println(n);
    }
}
