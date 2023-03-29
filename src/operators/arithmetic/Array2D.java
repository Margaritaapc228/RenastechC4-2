package operators.arithmetic;

public class Array2D {
    public static void main(String[] args) {

        //a 2 dimensional (2-D) array is an array or arrays
        //it is jagged or ragged array

        // int arr[][];
        //arr = new int[3][3];

       /* int arr[][]= new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[5];

        System.out.println(arr[2][0]);
        System.out.println(arr[2][4]);

        arr[0][2]=5;        arr[2][1]=7;
        System.out.println(arr[0][2] + arr[2][1]);*/

        /*int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[3];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/


        int arr [][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //System.out.println(arr.length);
        //System.out.println(arr[1].length);
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
