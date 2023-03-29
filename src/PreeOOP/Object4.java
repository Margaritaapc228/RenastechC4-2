package PreeOOP;

public class Object4 {
    public static void main(String[] args) {

        Box b = new Box();
        System.out.println(b.length);
        System.out.println(b.breadth);
        System.out.println(b.height);
        System.out.println(b.volume());
        b.length = 10;b.breadth = 5; b.height =2.2;
        System.out.println(b.length);
        System.out.println(b.breadth);
        System.out.println(b.height);
        System.out.println(b.volume());
    }
}

class Box{

    //properties of ht box object
    double length;
    double breadth;
    double height;

    //behavior of the box object
    double volume(){
        return length*breadth*height ;
    }
}
