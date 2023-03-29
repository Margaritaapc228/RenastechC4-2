package PreeOOP;

public class Constructor {
    //a CONSTRUCTOR is a special method in a class with no return type
    //it is name is same as the name of the class
    //a constructor is always called whenever an
    //object is created using new operator
    public static void main(String[] args) {

        new Movie();//anonymous movie object reference variable is not declare
        new Movie();

        Movie m = new Movie("Titanic", 1997);
        m.watchMovie();
    }
}
    class Movie {
        private String title;
        private String actor;
        private int year;

        void watchMovie(){
            System.out.println("Watching "+ this.title + "...");
        }

        Movie(){}

        Movie(String title, int year) {
            this.title = title;
            this.year = year;
            System.out.println("Constructor is called");
        }
    }
