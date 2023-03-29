package Revision;

public class RevisionIf {

    public static void main(String[] args) {

        int Salary=18000;
        if (Salary<1000) System.out.println("Not an employee");
        else if (Salary>1000 && Salary<=10000) System.out.println("Software Tester");
        else if (Salary>10000 && Salary<=25000) System.out.println("Software Developer");
        else if (Salary>25000 && Salary<=50000) System.out.println("Project Manager");
        else if (Salary>50000 && Salary<=100000) System.out.println("Team leader");
        else System.out.println("HR Manager");

    }
}
