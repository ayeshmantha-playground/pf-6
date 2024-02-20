import java.math.BigDecimal;

void main(){
    System.out.println(new String[5]);
    // First expression is a mandatory.
    System.out.println(new String []{"IJSE, DEP, GDSE, CMJD"});
    // Expression is not included here
    System.out.println(new int[5][][][][]);
    // First expression is a mandatory
    byte myByte = 5;
    short myShort = 3;
    char myChar = 1;
    int myInt = 3;
    long myLong = 4;

    System.out.println(new double[myByte + myShort + myByte + myInt]);
    // an expression can be used. Should be evaluated to a single value

//    System.out.println(new BigDecimal[-5]);
//    // negative expression doesn't give a compile error

}
