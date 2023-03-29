package OOPS;

import CodeReview.B;

public class Inheritance2 {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.accelerate();

    }
}

class Car {
    void accelerate(){
        System.out.println("accelerating...");
    }
}

//inheritance only works with the extends keyword
class BMW extends Car{

}


/*
INHERITANCE
-Have parent a child class, were the child class inherit the properties of the parent class
-use the keyword -extends-
 */