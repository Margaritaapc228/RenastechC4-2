package operators.arithmetic;

public class SwitchCase {
    public static void main (String []ap){

       /* int option = 30;
        switch (option){
            case 1: System.out.println("Hello"); break;
            case 2: System.out.println("Slav"); break;
            default: System.out.println("Eat noodles!"); break;
            case 3: System.out.println("Salam"); break;
            case 4: System.out.println("Chao"); break;

        int a=10, b=20;
        System.out.println("Numbers are a="+a + "\tb=" +b);
        int option=3;
        switch (option) {
            case 1:System.out.println("This is case 1 ");
                   System.out.println("a+b=" + (a+b));
                   break;
            case 2: System.out.println("This is case 2 ");
                    System.out.println("a-b=" + (a-b));
                    break;
            case 3: System.out.println("This is case 3 ");
                    System.out.println("a*b=" + (a*b));
                    break;
            case 4: System.out.println("This is case 4 ");
                    System.out.println("a/b=" + (a/b));
                    break;
            case 5: System.out.println("This is case 5 ");
                    System.out.println("a%b=" + (a%b));
                    break;
            default: System.out.println("no a option");
        }
        char color ='v';
        switch (color){
            case 'i':
            case 'I': System.out.println(" color is Indigo"); break;

            case 'v':
            case 'V': System.out.println(" color is Violet"); break;

            case 'b':
            case 'B': System.out.println(" color is Blue"); break;
            default: System.out.println("No color");}*/

        String season;
        int month=3;
        switch (month){
            case 12:
            case 1:
            case 2: System.out.println("Get yor coat");
            season = "Winter"; break;
            case 3:
            case 4:
            case 5: System.out.println("Lest go movies");
                season = "Spring"; break;
            case 6:
            case 7:
            case 8: season = "Summer"; break;
            case 9:
            case 10:
            case 11: season = "Autumn"; break;

            default:season="Not a season of Earth. Go to Mars";
        }
        System.out.println("Season is " + season);

    }
}
