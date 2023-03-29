package operators.arithmetic;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class ArrayStrings {

    public static void main(String[] args) {

        int i;
        i = 10;

        String name1 = "Zelal";
        String name2 = "Maggie";
        String name3 = "kqBud";
        String name4 = "Ruken";

        String names[];//declaration
        names = new String[50]; //initialization

        System.out.println(names.length);

        names[0] = "Kefo";
        names[5] = "Esther";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[5]);
        names[5]="Volkan";
        System.out.println(names[5]);
    }
}
