package PreeOOP;

public class StaticMethod {
    public static void main(String[] args) {
        Students.play();
        //System.out.println(Students.university);
        System.out.println(Students.getUniversity());
        Students s1 = new Students();
        Students s2 = new Students();
        System.out.println(s1.getName());
        System.out.println(s2.getName());

    }
}

class Students{

    static String university = "Harvard";
    private String name;
    private String course;

    static void play(){
        System.out.println("student is playing");
    }

    public static String getUniversity() {
        return university;
    }

    //no-entry os instance members inside the static methods
    public String getName() {
        return name;
    }
}
