package java24hour;

public class PrimitiveDataTypes {

  public static void main(String[] args)
  {
    // Declare and initialize a boolean variable
    boolean isTrue = true;
    byte theByte = -128;
    short theShort = 3276;
    long Along = 923_345_677_76556L;
    int theInt = 2147483647;

    //float need F or f
    float PIfloat = 3.141592653589793F;
    double theDoublePi = 3.141592653589793;
    //char store single character and within single quotes
    char nameInitial = 'A';

    /*
    ALL OF THIS STORE NUMBER BUT DIFFERENTLY CONSUME MEMORY DEPENDING ON THE TYPE;
     */

     System.out.println("The inital is " + nameInitial);
      System.out.println("The byte is " + theByte);
      System.out.println("The short is " + theShort);
      System.out.println("The long is " + Along);
      System.out.println("The int is " + theInt);
      System.out.println("The float is " + PIfloat);
      System.out.println("The double is " + theDoublePi);
      System.out.println("The boolean is " + isTrue);

  }
}