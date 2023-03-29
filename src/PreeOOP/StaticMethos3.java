package PreeOOP;

public class StaticMethos3 {
    public static void main(String[] args) {
        new Apples().eatingApple();
        //anonymous objects become unreachable after they are created
        new Apples().eatingApple();
        //a1 is the reference variable or reference or instance
        Apples a1 = new Apples();

        System.out.println(a1);
        System.out.println(Apples.getNumber());
        System.out.println("No. of apples object: "+ Apples.appleCount);
    }
}

class Apples{
    static  int appleCount;
    void eatingApple(){
        System.out.println("Eating apple");
    }
//constructor is called everytime when the object is created
    //so if we count how many times the constructor is called
    Apples(){
        appleCount++;
    }

    static int getNumber(){
        return 5;
    }
}