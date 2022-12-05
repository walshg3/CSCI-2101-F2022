package week8;

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedArrays {
    
    // Given an Array return true if 9 appears as first or last element of the array
    // Ex. frontEnd([1,2,9]) -> true
    // Ex. frontEnd([9,2,1]) -> true
    // Ex. frontEnd([1,2,3]) -> false
    // How to pass in an array as aparaemter
    public static boolean frontEnd(int[] nums) {
        // if (nums[0] == 9 || nums[nums.length - 1] == 9) {
        //     return true; 
        // }
        // return false;
        // if you have a return statement in an if statement you can just return the condition
        // assumes true otherwise return false
        return nums[0] == 9 || nums[nums.length - 1] == 9;
    }
    // given an int array if there is a 9 followed by a 1 and then another 1 return "The Police are on the way"
    // Ex. [1,2,9,1,1] -> "The Police are on the way"
    // Ex. [1,2,9,1,2] -> "No Police"
    // Ex. [9,1,2,1,1,1] -> "No Police"
    // Ex. [9,1,1,3,1,1] -> "The Police are on the way"
    // Ex. [1,2,9,1,1,1] -> "The Police are on the way"
    public static String police(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 9 && nums[i + 1] == 1 && nums[i + 2] == 1) {
                return "The number was: "+ nums[i] + nums[i + 1] + nums[i + 2] +"... The Police are on the way";
            }
        }
        return "No Police";
    }

    // Thursday we will make a method to collect a phone number
    // From the user and then pass that phone number into the array
    // Maybe we will even allow that phone number to be passed in 
    // as an argument in the main method
    // Maybe we will even check to make sure the number is 10 digits

    // Make a method to collect 10 numbers from the user
    // and then return an array of those numbers
    public static int[] collectNumbers() {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
        }
        input.close();
        return numbers;
    }

    public static void main(String[] args){
        int[] nums = {1,2,9};
        int[] nums2 = {0,2,1};
        System.out.println(frontEnd(nums));
        System.out.println(frontEnd(nums2));
        System.out.println(frontEnd(new int[]{9,2,1}));
        System.out.println(police(new int[]{8,6,7,5,9,1,1}));

        System.out.println("Testing the collectNumbers method");
        int [] phoneNumber = collectNumbers();
        System.out.println(police(phoneNumber));

        for(String arg: args){
            // System.out.println(arg);
            // Convert the String argument to an Integer
            int num = Integer.parseInt(arg);
            System.out.println(num);
        }
        // AdvancedArrays.java 8 6 7 5 3 0 9 1 1
        // make an array of size args.length
        int[] numArray = new int[args.length];
        // loop through the args array and convert each element to an int and add it to the numArray
        // Check if numArray is size 10 if not print "Please enter 10 numbers"
        if (args.length != 10) {
            System.out.println("Please enter 10 numbers or make sure you are passing in 10 numbers as arguments");
        } else {
            for (int i = 0; i < args.length; i++) {
                numArray[i] = Integer.parseInt(args[i]);
            }
            System.out.println(Arrays.toString(numArray));
            System.out.println(police(numArray));
        }





    }
}



// tochararray example