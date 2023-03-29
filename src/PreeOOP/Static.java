package PreeOOP;

public class Static {

    public static void main(String[] args) {

        Emp e1= new Emp("Batman", 250);
        Emp e2= new Emp("Robin", 200);
        System.out.println(e1.company);
        System.out.println(e2.company);
    }

}

class Emp{
    static  String company = "IBM";
    String name;//instance variables
    int salary;//instance variables

    //constructor
    Emp(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
}