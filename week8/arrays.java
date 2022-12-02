package week8;

import java.util.Scanner;

public class arrays {

    // Arrays are used to store multiple values in a singe variable
    public static void main(String[] args) {

        // decalre an array of integers
        // type[] name 
        // this will make an empty array
        int[] anArray;
        // allocate memory for 10 integers
        anArray = new int[10];

        // [100,200,0,0,0,0,0,0,0,0]
        System.out.println(anArray[0]);
        // Set value at index 0 to 100
        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2]= 300;
        anArray[3]= 400;
        anArray[4]= 500;
        anArray[5]= 600;
        anArray[6]= 700;
        anArray[7]= 800;
        anArray[8]= 900;
        anArray[9]= 1000;
        // anArray[10] = 1100; -> ArrayIndexOutOfBoundsException
        // System.out.println("Element at index - 0: " + anArray[0]);
        // System.out.println("Element at index - 1: " + anArray[1]);
        // System.out.println("Element at index - 2: " + anArray[2]);
        // System.out.println("Element at index - 3: " + anArray[3]);
        // System.out.println("Element at index - 4: " + anArray[4]);
        // System.out.println("Element at index - 5: " + anArray[5]);
        // System.out.println("Element at index - 6: " + anArray[6]);
        // System.out.println("Element at index - 7: " + anArray[7]);
        // System.out.println("Element at index - 8: " + anArray[8]);
        // System.out.println("Element at index - 9: " + anArray[9]);

        // System.out.println("Length of array: " + anArray.length);

        // for (int i = 0; i < anArray.length; i++) {
        //     System.out.println("Element at index - " + i + ": " + anArray[i]);
        // }

        // for each loop
        // for (type variableName : arrayName) {
        //     // code block to be executed
        // for (int i : anArray) {
        //     System.out.println("Element: " + i);
        // }

        // Create a String array in 1 line
        String[] names = {"John", "Jane", "Joe", "Jill"};
        System.out.println("Length of names array: " + names.length);
        for (String name : names) {
            System.out.println("Name: " + name);
        }


        // what if we dont know the information ahead of time?
        String[] namesunknown = new String[20];

        namesunknown[0] = "John";
        namesunknown[1] = "Jane";
        namesunknown[2] = "Joe";
        namesunknown[3] = "Jill";
        //[John, Jane, Joe, Jill, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]


        System.out.println();
        System.out.println(namesunknown[4]);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = scan.nextInt();
        String[] namesunknown2 = new String[size];


        // create an array of String str length
        // Collect a word from the user
        // store the word in the array
        // print the array
        System.out.println("Enter a word: ");
        String word = scan.next();
        char[] wordArray = new char[word.length()];

        // if you add a space in here the program will end
        // ie "hello world" will only store "hello"
        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = word.charAt(i);
        }
        
        for(char c: wordArray){
            System.out.println(c);
        }
        System.out.println();
        System.out.println(wordArray[0]);
        System.out.println(wordArray[5-3]);

    }
    
}
