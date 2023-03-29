package Revision;

public class RevisionConstructor {
    static  int count;

    RevisionConstructor(){
        System.out.println("Object number "+ ++count + " created...");
    }

    public static void main(String[] args) {
        new RevisionConstructor();
        RevisionConstructor c = new RevisionConstructor();
        new RevisionConstructor();

    }
}
