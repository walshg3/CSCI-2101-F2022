package week5;
import java.util.Scanner;

public class UserInput {
    

    // static reference for Scanner - can be used anywhere in your program
    // static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String name = "Tom";
        System.out.println(name);
        System.out.println("Hello. What is your name?");
        Scanner keyboard = new Scanner(System.in); 
        // This creates a Scanner object called keyboard
        // can only be used inside the main method
        name = keyboard.nextLine(); // reads a line of text from the keyboard
        System.out.println("Hello " + name);
        System.out.println("How old are you?");
        int age = keyboard.nextInt(); // reads an int from the keyboard
        System.out.println("You are " + age + " years old");
        System.out.println("How much money do you have?");
        // double money = keyboard.nextDouble(); // reads a double from the keyboard
        double money = 0.0;
        boolean money2 = keyboard.hasNextDouble(); // come back here with if statement
        // if (money2 == true) {
        //     money = keyboard.nextDouble();
        //     System.out.println("You have $" + money);
        // } else {
        //     System.out.println("You did not enter a number");
        // }
        
        try {
            money = keyboard.nextDouble();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("You have to enter a number");
        }
        // you would do an if statement here
        System.out.println("You have $" + money);


    }
}

