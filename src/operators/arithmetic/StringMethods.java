package operators.arithmetic;

public class StringMethods {
    public static void main(String[] args) {

        //Contains
        String str = "HumptyDumpy";
        boolean b = str.contains("mpty");

        System.out.println(b);

        System.out.println("HelloFelloRello".contains("Fell"));

        //Trip
        String s2 = "  Hello guys   !     !";
        System.out.println(s2.trim());

        //tolowercase
        System.out.println("slav_chao_NAMASTE".toLowerCase());
        //touppercase
        System.out.println("slav_chao_NAMASTE".toUpperCase());

        String s3 = "New York Chicago";
        //startsWith
        System.out.println(s3.startsWith("New"));
        System.out.println(s3.startsWith("new"));

        //endWith
        System.out.println(s3.endsWith("ork"));
        System.out.println("hell ogo".endsWith(" ogo"));

        //contentEquals
        String s4 = "Hello-slav";
        String s5 = "Hello-slav";
        s5 =new String(s5);
        System.out.println(s4.contentEquals(s5));
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

    }
}
