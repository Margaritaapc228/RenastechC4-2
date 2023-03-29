package operators.arithmetic;

public class NestedIf {
    public static void main(String[] args) {
/*
    int population = 10000 , area = 10000;
    if (population <10000 ){

        if (area<10000){
            System.out.println("Small country");
        }
        else System.out.println("Population is less than 10000 but area is grater than 10000 ");
    }
    else {
        if (area<10000){
            System.out.println("Population is greater than 10000 and area is less than 10000");
        }
        else
            System.out.println("Population is greater than 10000 and also area is greater than 1000");
    }*/
        int population=8000, area=40000;
        if (population<10000 && area<10000) System.out.println("small country");
        else if (population<10000 && area>10000) System.out.println("small population / big area");
        else if (population>10000 && area<10000) System.out.println("big population / small area");
        else if (population>10000 && area>10000) System.out.println("big country");

    }

}
