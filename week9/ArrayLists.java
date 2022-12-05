package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import week6.BankAccount;


public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("Array List Lesson!");
        // ArrayLists are used to store multiple values in a single variable
        // ArrayLists are dynamic arrays!!!
        // ArrayLists are used to store data of any type
        // Array -> fixed size -> int[] anArray = new int[10];
        // For example when we looked at the phone numbers being size 10
        // ArrayList -> dynamic size -> ArrayList<String> names = new ArrayList<String>();
        // Arrays are good for storing data of the same type
        // ArrayLists are good for storing data of different types and same types
        // Can be expanded or contracted as needed
        // How to make an ArrayList
        // ArrayList<type> name = new ArrayList<type>();
        
        ArrayList<String> cars = new ArrayList<String>();

        // Constructs an empty list with an initial capacity of ten.

        // how do we add values to an arraylist
        // add() method
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Tesla");
        cars.add("Mazda");
        // How do we print the arraylist
        System.out.println(cars);

        // How do we get the size of an arraylist
        // size() method
        System.out.println("Size of cars arraylist: " + cars.size());
        
        // you still can do for each loops with arraylists
        for (String car : cars) {
            System.out.println("Car Brand: " + car);
        }
        

        // How do we get a value at a specific index
        // get() method
        System.out.println("Car at index 0: " + cars.get(0));
        System.out.println("Car at index 1: " + cars.get(1));
        System.out.println("Car at index 2: " + cars.get(2));
        System.out.println("Car at index 3: " + cars.get(3));

        // How do we remove a value from an arraylist
        // remove() method
        cars.remove(0);
        System.out.println("Size of cars arraylist: " + cars.size());
        System.out.println(cars);


        // How do we make arraylists of different types
        // ArrayList<type> name = new ArrayList<type>();
        // Here is an example of an Integer ArrayList
        // notice the <Integer> instead of <String>
        // notice the 'Integer' instead of 'int'
        // This is because ArrayLists can only store objects !!!!
        // int is a primitive data type
        // Integer is a wrapper class for int
        // Wrapper classes are used to convert primitive data types into objects
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Examples with other data types
        // int  -> Integer
        // char -> Character
        // long -> Long
        // float -> Float
        // double -> Double
        // boolean -> Boolean

        // How do we add values to an arraylist of different types
        // add() method
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        // We can add specific variables to an arraylist
        int test = 6;
        numbers.add(test);
        System.out.println(numbers);

        // Characters are stored as strings in an arraylist
        ArrayList<Character> letters = new ArrayList<Character>();
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        letters.add('e');
        System.out.println(letters);

        // Array list of doubles
        ArrayList<Double> decimals = new ArrayList<Double>();
        decimals.add(1.1);
        decimals.add(2.2);
        decimals.add(3.3);
        decimals.add(4.4);
        decimals.add(5.5);
        System.out.println(decimals);

        // Array list of booleans
        ArrayList<Boolean> bools = new ArrayList<Boolean>();
        bools.add(true);
        bools.add(false);
        bools.add(true);
        bools.add(false);
        bools.add(true);
        System.out.println(bools);


        // How do we sort the values in an arraylist?
        // sort() method
        // Collections.sort(arraylist);
        // Collections is a class that has a lot of useful methods
        // sort() is a method that sorts the values in an arraylist
        // Collections.sort() only works with arraylists of the same type
        // Collections.sort() only works with arraylists of objects
        // For example
        // Collections.sort(numbers); // works
        // Collections.sort(letters); // works
        // Collections.sort(decimals); // works
        // Collections.sort(bools); // works
        // Collections.sort(cars); // works
        // Collections.sort(1); // does not work
        // Collections.sort('a'); // does not work
        // Collections.sort(1.1); // does not work
        // Collections.sort(true); // does not work
        // Collections.sort("Hello"); // does not work
        System.out.println("Before sorting: " + cars);
        Collections.sort(cars);
        System.out.println("After sorting: " + cars);
        // Note: Collections.sort() on an arraylist of strings will sort the strings alphabetically


        // We can use ArrayLists to pass values to methods
        // We can use ArrayLists to return values from methods
        // Lets use the BankAccount Object from week6
        // Lets make an ArrayList of BankAccount Objects
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        // Lets add some BankAccount Objects to the ArrayList
        accounts.add(new BankAccount("John", 1000));
        accounts.add(new BankAccount("Jane", 2000));
        accounts.add(new BankAccount("Joe", 3000));
        accounts.add(new BankAccount("Jill", 4000));
        accounts.add(new BankAccount("Jack", 5000));
        // Lets print the ArrayList
        System.out.println(accounts);
        // Notice that the ArrayList prints the BankAccount Objects in a weird way
        // Lets print the first account in the ArrayList using the get() method
        System.out.println(accounts.get(0));
        // Lets print the name of the first account in the ArrayList
        System.out.println(accounts.get(0).getName());
        // Lets print the balance of the first account in the ArrayList
        System.out.println(accounts.get(0).getBalance());
        // Lets print the balance of the second account in the ArrayList
        System.out.println(accounts.get(1).getBalance());
        // Lets print the balance of the third account in the ArrayList
        System.out.println(accounts.get(2).getBalance());
        // Lets print the balance of the fourth account in the ArrayList
        System.out.println(accounts.get(3).getBalance());
        // Lets print the balance of the fifth account in the ArrayList
        System.out.println(accounts.get(4).getBalance());
        // Lets print the balance of the last account in the ArrayList
        System.out.println(accounts.get(accounts.size() - 1).getBalance());
        // Lets deposit $1000 to the first account in the ArrayList
        accounts.get(0).deposit(1000);
        // Lets print the balance of the first account in the ArrayList
        System.out.println(accounts.get(0).getBalance());



        // This can be written in a way we are more used to seeing
        BankAccount gregChecking = new BankAccount("Greg", 1000);
        accounts.add(gregChecking);
        // Above is the same as below
        accounts.add(new BankAccount("Greg", 1000));


        // Lets Call the Method printAccounts() and pass it the ArrayList accounts
        printAccounts(accounts);
        


    }
    // Lets make a method that takes an ArrayList of BankAccount Objects
    // and prints the name and balance of each account
    public static void printAccounts(ArrayList<BankAccount> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Name: " + accounts.get(i).getName());
            System.out.println("Balance: " + accounts.get(i).getBalance());
        }
    }
    // On Tuesday we will make a method to apply the monthly fee method to all these accounts
}
