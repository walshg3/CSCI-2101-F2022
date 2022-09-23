package week1;
public class Examples {
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println("Black");
        String color = "Black";
        // Java does math
        System.out.println(3+3);// addition
        System.out.println(2-3);// subtraction
        System.out.println(3*3);// multiplication
        System.out.println(3/3);// division
        System.out.println(2/3);// division - rounded down
        System.out.println(3%3);// modulus - remainder of division

        // Java Types - 8 primitive types
        // int - integer - whole numbers 3, 4, 5, 6, 7, 8, 9, 10
        // double - decimal numbers 3.0, 4.0, 5.5, 6.2, 7.0, 8.0, 9.9
        // char - character - single letter 'a', 'b', 'c', 'd', 'e'
        // boolean - true or false 
        // String - a sequence of characters "Hello", "World", "Greg"
        // long - integer
        // float - decimal
        // short - integer
        
        // Scope Types
        // Local - inside a method
        // Instance - inside a class
        // Class - inside a class, but outside a method

        // Pubic - anywhere in the program
        // Private - only inside the class
        // Protected - inside the class and subclasses
        // Default - inside the package

        // Java Operators  
        // + - * / % ++ -- += -= *= /= %= == != > < >= <= && || !
        // = - assignment operator
        // == - equality operator
        // != - not equal operator
        // > - greater than operator
        // < - less than operator
        // >= - greater than or equal to operator
        // <= - less than or equal to operator
        // && - and operator
        // || - or operator
        // ! - not operator

        // String Concatenation
        System.out.println("Hello" + " " + "World");
        System.out.println("Hello" + " " + 3);
        System.out.println("Hello" + " " + 3.0);
        System.out.println("Hello" + " " + 'a');
        System.out.println("Hello" + " " + true);
        System.out.println("Hello" + " " + false);
        System.out.println("Hello" + " " + 3 + 3);
        System.out.println("Hello" + " " + (3 + 3));
        System.out.println("Hello" + " " + 3 + 3 + 3);
        System.out.println("Hello" + " " + (3 + 3 + 3));
        // String Concatenation - String + String = String 
        // String Concatenation with variables
        String name = "Greg";
        System.out.println("Hello" + " " + name);
        System.out.println("Hello" + " " + name + " " + name);
        String greeting = "Hello";
        System.out.println(greeting + " " + name);
        int number = 9;
        System.out.println(greeting + " " + name + " " + number);
        System.out.println(greeting +", my name is " + name + " my favorite number is " + number + " and my favorite color is " + color);

















    }
}
