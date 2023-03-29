package Revision;

public class PracticeObject {
    public static void main(String[] args) {
        Apple myApple= new Apple();
        System.out.println(myApple.price);
        System.out.println(myApple.getPrice());
        myApple.setPrice(12);
        System.out.println(myApple.getPrice());
    }
}
class Apple{
    int price;
    int getPrice(){return price;}
    void setPrice(int price){this.price=price;}
}