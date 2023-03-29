package PreeOOP;

public class Object6 {
    public static void main(String[] args) {

        Songs s = new Songs();
        System.out.println(s.getArtist());
        System.out.println(s.getTitle());
        s.setArtist("Shakira");
        s.setTitle("Whenever wherever!!");
        System.out.println(s.getArtist());
        System.out.println(s.getTitle());


    }
}
class Songs {

    //data member and instance member funtions are together called instance members
    String title, artist;//stage of the object

    void setTitle(String title){this.title=title;}
    String getTitle(){return title;}

    void setArtist(String artist){this.artist=artist;}
    String getArtist(){return artist;}

}