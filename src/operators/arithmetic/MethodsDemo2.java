package operators.arithmetic;

public class MethodsDemo2 {
  /*  public static void main(String[] args) {
        m1();
        int i = m2(5);
        System.out.println(i);
    }
    static void m1(){
        System.out.println("m1");
    }
     static int m2(int k){
         System.out.println("Poland");
         return k*k;
     }*/
//____________________________________________
    /*public static void main(String[] args) {
        show("Tom",65);
        show();
        show("Jerry",75);
    }
    //when 2 or more methods have the same name, this is called method overloading
    static void show(String name, int salary ){
        System.out.println(name+ "\t"+ salary );
    }

    static void show(){
        System.out.println("no-args show method");
    }*/
    //____________________________________________

    int show (int a){
        int b = a*a;
        return a+b;
    }
    static String m1(int b){
        return "Hello " + b;
    }

    public static void main(String[] args) {
        m1(50);

        String str = m1(60);
        System.out.println(str);
        System.out.println(m1(50));

    }
}
