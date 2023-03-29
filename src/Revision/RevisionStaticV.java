package Revision;

public class RevisionStaticV {
    static {
        System.out.println("Hi");
    }
    {
        System.out.println(demo.i);
        System.out.println("Hello");
    }
    RevisionStaticV(){
        demo.i = 30;
        System.out.println("slaw");
    }

    public static void main(String[] args) {
        System.out.println("chao");
        new RevisionStaticV();

        System.out.println("Merhaba");
    }
}
