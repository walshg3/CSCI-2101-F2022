package week5;

public class MathPlayground {
    static double balance = 1000.3;
     // Casting
     // declare int value = (TypeName) NameOfVariable
        // int value = (int) balance;
    static int intbal = (int) balance;


    public static void main(String[] args) {
        System.out.println(balance);
        System.out.println(intbal);
        System.out.println(Math.round(balance));
        System.out.println(Math.ceil(balance));
        System.out.println(Math.floor(balance));
        System.out.println(Math.max(7.1, 2));
        System.out.println(Math.toRadians(34));
    }
}
