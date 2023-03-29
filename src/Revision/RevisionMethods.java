package Revision;

public class RevisionMethods {
    public static void main(String[] args) {

        Employee e1= new Employee("Maggie", (byte) 28, 6000, "South Orange");
        Employee e2= new Employee("Jerry", (byte)34, 8000, "NYC");
        e2.raiseSalary(1.2);
        e1.raiseSalary(1.2);
        System.out.println("Name: "+ e1.getName()+ "\nAge: "+ e1.getAge()+ "\nSalary: "+ e1.getSalary()+ "\nLocation: "+ e1.getLocation());
        System.out.println("\nName: "+ e2.getName()+ "\nAge: "+ e2.getAge()+ "\nSalary: "+ e2.getSalary()+ "\nLocation: "+ e2.getLocation());
    }
}

class Employee{
   private String name, location;
    private byte age;
    private double salary;

    public Employee (String name, byte age, double salary, String location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    void raiseSalary(double raise_percent){
        this.salary = this.salary + raise_percent/100 * this.salary;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public byte getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }



}
