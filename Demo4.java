void main(){
    int[] myArray1 = new int[]{10, 20, 30};
    int[] myArray2 = {10, 20, 30, 40};
    int[][] my2dArray = new int[][]{myArray1, myArray2};
    int[][] my2dArray1 = new int[2][];
    int[][] my2dArray2 = {{10, 30}, {10, 20}};


    System.out.println(my2dArray[0]); // This is a memory location
    System.out.println(my2dArray[1]); // This is a memory location
    System.out.println(my2dArray[0] == myArray1);// true
    System.out.println(my2dArray[1] == myArray2);// true
    System.out.println(my2dArray[0][1]); //access to a index

}