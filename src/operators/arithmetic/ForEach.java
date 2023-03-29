package operators.arithmetic;

public class ForEach {
    public static void main(String[] args) {

       /* int[]numbers={1,2,3,4,5};

        for (int eachNumber : numbers){
            System.out.println(eachNumber);
        }
        String [] names= {"maggie","yanet","eric"};
        for (String name : names){
            System.out.println(name);
        }*/

        String sentence = "Hello lovely java people";
        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
        int[] numberList={1,2,3,4,5,6,7,8};
        for (int number : numberList){
            System.out.println(number);
        }
    }
}
