package operators.arithmetic;

public class AnonymousArray {
   /* public static void main(String[] args) {
        printArray(
            new int[]{10,20,30}//an anonymous array as an argument
        );

        System.out.println();
        printArray(new int[]{1,2,3}
        );
    }

    static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }*/
    //______________________________________-

   /* public static void main(String[] args) {

        int myArray[] = show();

        for (int i=0;i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }

    //return type of show method is an int array
    static int[] show(){
        System.out.println("Hello");

        int arr[] = {10,20,30,40};
        return arr;
    }**/
    //______________________________________-
              //anonymous 2-D array
   public static void main(String[] args) {
       print2DArray(
               new int[][]{
                       {10,20,30},
                       {40,50,60},
                       {70,80,90}
               }

       );
   }

   static void print2DArray(int arr [][]){
       for (int i=0; i<arr.length;i++){
           for (int j=0; j< arr[i].length; j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }
   }
}
