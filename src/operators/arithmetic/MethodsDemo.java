package operators.arithmetic;

public class MethodsDemo {
   /* public static void main(String[] args) {//calling method
        show();
    }
    static void show(){//called method
        System.out.println("This is show method");
        play();
    }
    static void play(){
        System.out.println("Play method");
    }*/
    //_____________________________________

   /* public static void main(String[] args) {
        //local variable: any variable declared inside a method
        int i = 10;
        m1();
        System.out.println("Hello people");
    }

    static void m1(){
        m2();
        int j = 50;
        System.out.println("m1 method");
        m2();
    }

    static void m2(){
        int k = 30;
        System.out.println("m2 method");
    }*/
    //________________________________________-

        //public and static are modifiers
        //public : access modifier
        //static : non-access modifier
        //void : return type
        //main : name of the method
        //String[] : argument or parameter; args is a variable of string[] type
        //{} : body of the method
        public static void main(String[] args) {

    }

    //a method can be declaring a method
    //below method only have a return type and method name
    void display(){
            return;//returning statement without a returning value->OPTIONAL
    }

    //modifier is static, method name is getSalary
    //one int parameter
    static int getSalary(int days_worked) {
           return 1000;//returning statement
    }

}
