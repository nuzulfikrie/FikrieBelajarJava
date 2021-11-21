public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        int number = 9;
        System.out.println("Square root of " + number + " is " + SquareRoot(number));
    }

    public static int SquareRoot(int number) {
        return (int) Math.sqrt(number);
    }
}
