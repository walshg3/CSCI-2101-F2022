package week2;
public class Playground {
    public static void main(String[] args) {
        String name = "Greg";
        // System.out.println(name);

        String s = "Hello";
        addExclamationPoint(s);
        // System.out.println(s + "!");
        String y = "World";
        addExclamationPoint(y);
        // System.out.println(y + "!");
        addQuestionMark(name);
        // addExclamationPointnew(name);
        String addedvalue = addExclamationPointnew(name);
        System.out.println(addedvalue);
        System.out.println(addQuestionMarknew(s));
        // Objects contain Methods
        // Methods are functions that belong to an object   
        // a String is actually an object
        // we can call methods on the String Object
        System.out.println("Hello".length());
        //  HELLO
        //  12345 -> Length = 5
        //  01234 -> Index = 4
        // Java starts counting at 0
        System.out.println("Hello".charAt(0)); // H
        System.out.println("Hello".charAt(1)); // e
        System.out.println("Hello".charAt(2)); // l
        System.out.println("Hello".charAt(3)); // l
        System.out.println("Hello".charAt(4)); // o
        // System.out.println("Hello".charAt(5)); // error -> out of bounds
        // System.out.println("Hello".charAt(-1)); // error -> out of bounds
        // System.out.println("Hello".charAt(0.5)); // error -> double
        // System.out.println("Hello".charAt('a')); // error -> char this is looking for an number (int)
        // System.out.println("Hello".charAt(true)); // error -> boolean
        // System.out.println("Hello".charAt("a")); // error -> String

        // Call methods off a variable name
        String catName = "Appa";
        System.out.println(catName);
        System.out.println(catName.length());
        System.out.println(catName.charAt(0));
        System.out.println(catName.toUpperCase());
        System.out.println(catName.toLowerCase());
        System.out.println(catName.substring(1));
        System.out.println(catName.substring(1, 3));

    }

    // Method Definition - a method is a block of code that performs a specific task
    // Method Declaration - a method declaration is the name of the method and the parameters

    // SCOPE, static/non-static, return type, method name, parameters, body
    // Parameters - a list of variables that are passed to the method
    // Arguments - the values that are passed into the method
    // void - a return type that means the method does not return a value   
    public static void addExclamationPoint(String s){
        s = s + "!";
        System.out.println(s);
        // System.out.println(s + "!");
    }
    public static void addQuestionMark(String s) {
        s = s + "?";
        System.out.println(s);
    }
    // lets see a method that returns a value
    // SCOPE, static/non-static, return type, method name, parameters, body
    // return type - the type of value that the method returns  
    public static String addExclamationPointnew(String s){
        // s = s + "!";
        return s + "!";
    }

    public static String addQuestionMarknew(String s) {
        return s + "?";
    }



}
