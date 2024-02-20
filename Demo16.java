void main (){
    int[] myArray1 = {10, 20, 30, 40};
    int[] myArray2 = new int[]{10, 20, 30};
    int[] myArray3 = null;
    int[][] my2dArray = {myArray1, myArray2, myArray3};
    System.out.println(my2dArray[0]);
    myArray1 = null;
    System.out.println(myArray1);
    System.out.println(my2dArray[0]);

    int[][] ar = new int[3][];
    int[][] ar1 = new int[3][2];

    System.out.println(ar[0]);
    System.out.println(ar[1]);
    System.out.println(ar[2]);

    System.out.println(ar1[0][0]);

    int[] arNew2 = {10, 20};
    int[] arNew3 = {10, 20, 30};
//    ar1[0] = arNew2;
    ar1[0] = arNew3;
    System.out.println(ar1[0][2]); // how is this possible

    String st;
    Number n;
    Object o;

}