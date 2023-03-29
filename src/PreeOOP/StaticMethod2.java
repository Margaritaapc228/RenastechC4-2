package PreeOOP;

import Fundaments.Demo2;

public class StaticMethod2 {
    public static void main(String[] args) {
        //anonymous object:when the reference of the object is not stored
        //in a variable, it is called an anonymous object
        new Demo2().play();
        Demo2 d = new Demo2();
        d.play();

    }
}
class Demo{
    static int a = 10;

    static void show(){
        System.out.println("show");
       // play();//non-static method can be called directly from inside on a instance method
    }
    void play(){
        System.out.println("play");
        show();//static method can called from anywhere
    }
}
