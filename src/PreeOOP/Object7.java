package PreeOOP;

public class Object7 {
    public static void main(String[] args) {
        book b = new book();
        b.setTitle("Twilight");
        b.setAuthor("Stephenie Meyer");
        b.setPrice(45.5);
        System.out.println(b.getTitle());
        System.out.println(b.getAuthor());
        System.out.println(b.getPrice());
        book b1 = new book();
        b1.setTitle("\nMockingjay");
        b1.setAuthor("Suzanne Collings");
        b1.setPrice(56.9);
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getPrice());
        book b2 = new book();
        b2.setTitle("\nWicked");
        b2.setAuthor("Gregory Manguire");
        b2.setPrice(85.5);
        System.out.println(b2.getTitle());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getPrice());

    }
}

class book{

    private String title;
    String author;
    double price;

    void setTitle(String title){this.title=title;}
    String getTitle(){return title;}

    void setAuthor(String author){this.author=author;}
    String getAuthor(){return author;}

    void setPrice(double price){this.price=price;}
    double getPrice(){return price;}

    //a CONSTRUCTOR is a special method in a class with no return type
    //it is name is same as the name of the class
    //a constructor is always called whenever an object is created using new operator
    book(){}
}
