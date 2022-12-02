package week7;

import java.util.Scanner;

public class WhileHelper {

    // public double total = 0;
    // public int count = 0;
    // public Scanner scan = new Scanner(System.in);

    public void forLoopAverage() {
        // calculate the average using a for loop
        double total = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: ");
            double number = scan.nextDouble();
            total += number;
            count++;
        }
        double average = total / count;
        System.out.println("Count is: " + count);
        System.out.println("Average: " + average);
        
    }

    // This is what the Average method looks like using a while loop
    public void whileLoopAverage() {
        // calculate the average using a for loop
        double total = 0;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        // the way a while loop works is that it will run the code inside the loop
        // until the condition is false
        // boolean false statement or a break will end the loop
        // while the condition is true
        // while number is not = 0
        System.out.println("Enter a number, q to quit: ");
        while (scan.hasNextDouble()) {
            System.out.println("Enter a number, q to quit: ");
            double number = scan.nextDouble();
            total += number;
            count++;
        }
        double average = total / count;
        System.out.println("Count is: " + count);
        System.out.println("Average: " + average);
    }

    public void checkDup() {
        // check if duplicate number has been entered. If so, break out of the loop
        // and display the number
        double previous;
        double current = -1;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number, q to quit: ");
        while (scan.hasNextDouble()) {
            previous = current;
            System.out.println("Enter a number, q to quit: ");
            current = scan.nextDouble();
            if (current == previous) {
                System.out.println("Duplicate number entered: " + current);
                break;
            }
        }

        
    }
    // Make a method that will collect a String input from the user and check if the pill is blue or red.
    // If the pill is red the program will say "welcome to the matrix"
    // if the pill is blue prompt the user again for their choice

    public void redPillBluePill() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What will your choice be Red or Blue: ");
        String pill = scan.nextLine();
        while (!pill.equalsIgnoreCase("red")) {
            System.out.println("Have a nice life");
            System.out.println("What will your choice be Red or Blue: ");
            pill = scan.nextLine();
        }
        System.out.println("Welcome to the Matrix");
        }
        
}

