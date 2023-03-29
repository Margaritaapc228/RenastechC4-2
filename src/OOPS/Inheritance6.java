package OOPS;

public class Inheritance6 {
    public static void main(String[] args) {
        Evlet e = new Evlet();
        e.show();
        e.display();
    }
}

class Dede6{
    void show(){
        System.out.println("Hello");
    }
}

class Baba6 extends Dede6{
    private void play(){System.out.println("Hi");}
        void display(){ play();}

}

class Evlet extends Baba6{
    private int i = 5;
}