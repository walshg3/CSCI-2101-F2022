package week7;

import java.util.Scanner;

public class ForHelper {

    /**
     * @param searchString - is the string to search
     * @param searchChar   - char to find
     * @return String - the number of times the char was found
     */
    // RETURN TYPE PARAMETERS
    public String countXchars(String searchString, char searchChar) {
        // init a counter to 0
        int count = 0;
        // loop through the string
        for (int i = 0; i < searchString.length(); i++) {
            // if the char at position i is the same as searchChar
            if (searchString.charAt(i) == searchChar) {
                // increment the counter
                System.out.println("Found " + searchChar + " at position: " + i);
                count++;
            }
        }

        return "Found " + searchChar + " " + count + ": times";
    }

    // For loop to collect user input and output a running total of the numbers
    // entered
    public void sumUserInput() {
        // Add scanner to collect user input
        Scanner Keyboard = new java.util.Scanner(System.in);
        // init a counter to 0
        int total = 0;
        // loop through the string
        for (int i = 0; i < 10; i++) {
            // if the char at position i is the same as searchChar
            System.out.println("Enter a number: ");
            int number = Keyboard.nextInt();
            total += number;
            System.out.println("Total: " + total);
        }
    }
    // Nest For Loops
    // Loop within a Loop
    // *****
    // *****
    // *****
    // *****
    // *****

    public void nestedForLoop() {
        // init a counter to 0
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of rows:");
        int rows = scan.nextInt();
        System.out.println("Please enter number of columns:");
        int columns = scan.nextInt();
        // Ask user for symobl
        System.out.println("Please enter symbol:");
        String symbol = scan.next();


        // loop throgh the rows
        for(int i=0; i<rows; i++){
            System.out.println();
            // increment through the columns
            // Nested for loop
            for(int j = 0; j < columns; j++){
                // incharge of columns until it reaches the end
                // then moved back to the outer loop
                System.out.print(symbol);
            }
        }
        System.out.println();
        System.out.println("Done");
    }
}
