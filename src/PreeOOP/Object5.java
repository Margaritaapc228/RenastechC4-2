package PreeOOP;

public class Object5 {

    public static void main(String[] args) {

    Student s1= new Student();
    s1.name = "Gulnaz";
    s1.age = 25;
        System.out.println(s1.name);
        System.out.println(s1.age);

    Student s2= new Student();
    s2.name = "Eren";
    s2.age = 20;
        System.out.println(s2.getName());
        System.out.println(s2.getAge());

    Student s3= new Student();
    s3.name = "Kefo";
    s3.age = 30;
        System.out.println(s3.getName());
        System.out.println(s3.getAge());
    }
}

class Student{

    String name;
    byte age;

    void study(){
        System.out.println("student is studying");
    }

    //accessor methods or getter methods
    String getName(){
        return name;
    }

    byte getAge(){
        return age;
    }
}