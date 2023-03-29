package CodeReview;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Fruit {
    static {
        System.out.println("hi");
    }

    //if we want to make a class executable
    public static void main(String[] args) {
        new Orange();
    }
    {
        System.out.println("Slaw");
    }
}
