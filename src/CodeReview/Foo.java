package CodeReview;

public class Foo {
    {
        System.out.println("Hello");
    }
    static {
        new Foo();
        System.out.println("Hi");
    }

    Foo(){
        System.out.println("Bye");
    }
}
