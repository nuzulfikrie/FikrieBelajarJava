public class BlankFillerPowerTwo {

  public static void main(String[] args) throws Exception {

    if(args.length != 3) {
      throw new Exception("Wrong number of arguments supplied must be at least 3");
    } else{
      System.out.println(" Received arguments are \n number 1:" + args[0] + "\n number 2: " + args[1]  + "\n number 3:" + args[2] );
      double [] valuesConverted =  new double[args.length];
      double [] valuesConvertedPowerTwo =  new double[args.length];

      for( int i = 0; i < valuesConverted.length; i++){
        valuesConverted[i] = convertStringToDouble(args[i]);
      }

  //convert values, power by 2
      for( int counter = 0; counter < valuesConvertedPowerTwo.length; counter++){
        valuesConvertedPowerTwo[counter] = PowerTwo(valuesConverted[counter]);
      }

      for(double EL : valuesConvertedPowerTwo){
        System.out.println("converted power of 2  ->" + EL);
      }
    }




  }
  private static  double convertStringToDouble(String string) {
    System.out.println(" CONVERTED TO DOUBLE RECEIVED args is " + string);
    return Double.parseDouble(string);
  }
  private static double PowerTwo(double number){

    double b = 2;
    return Math.pow(number, b);
  }
}
