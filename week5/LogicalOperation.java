package week5;

import java.util.Scanner;

import week4.Person;

public class LogicalOperation {

    public static void main(String[] args) {
        System.out.println("Logic");

        // if statements
        // if (condition)
        // else if (condition)
        // else

        // if (condition) {
        // if true, do this
        // }

        // if (condition) {
        // if true, do this
        // } else if (condition) {
        // if true, do this
        // } else {
        // if false, do this
        // }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name);
        // Check if name is "Bob"
        // You can do that with the String .equals() method
        if (name.equals("Bob")) {
            System.out.println("You are Bob");
        } else if (name.equals("bob")) {
            System.out.println("You are bob");
        } else if (name.equals("Greg")) {
            System.out.println("You are Greg");
        } else {
            System.out.println("You are not Bob or Greg");
        }

        // Logical Operators
        // && - and
        // || - or
        // ! - not

        // && - both conditions must be true
        // || - either condition must be true
        // ! - the condition must be false

        // if (condition && condition) {
        // if true, do this
        // }

        // if (condition || condition) {
        // if true, do this
        // }

        // if (!condition) {
        // if true, do this
        // }

        if (name.equals("Bob") || name.equals("bob")) {
            System.out.println("You are Bob");
        } else if (name.equals("Greg") || name.equals("greg")) {
            System.out.println("You are Greg");
        } else {
            System.out.println("You are not Bob or Greg");
        }
        // Here is a catch all for Bob or bob or BoB
        // Any case will be caught in this method
        // if (name.equalsIgnoreCase("Bob")) {
        // System.out.println("You are Bob");
        // } else {
        // System.out.println("You are not Bob");
        // }

        // Other Operators
        // < - less than
        // > - greater than
        // <= - less than or equal to 
        // >= - greater than or equal to
        // == - equal to
        // != - not equal to
        System.out.println("What is your age?");
        int age = keyboard.nextInt();
        
        Person p = new Person(name, age, "Black", 50.0); // instantiate a Person object with name, age, favColor, giftTotal

        if (p.age > 21 || p.giftTotal > 100.0) {
            System.out.println("Hey " + p.name);
            System.out.println(Person.welcomeMessage());
        } else {
            System.out.println("You are not over 21. Get out of here");
        }

        
        
    }
}
