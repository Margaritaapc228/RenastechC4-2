package PreeOOP;

public class Object3 {
    public static void main(String[] args) {

        Car1 c = new Car1();
        System.out.println(c.color);
        System.out.println(c.type);
        c.accelerate();
    }
}

class Car1{

    //instance variables or properties of the car
    String color = "Red";
    String type = "Sedan";

    //instance method represents the behavior of the object
    void accelerate(){
        System.out.println("push accelerator");
    }
}