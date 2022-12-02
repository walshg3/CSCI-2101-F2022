package week8;

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

    public static void main(String[] args){
        int[] nums = {1,2,9};
        int[] nums2 = {0,2,1};
        System.out.println(frontEnd(nums));
        System.out.println(frontEnd(nums2));
        System.out.println(frontEnd(new int[]{9,2,1}));
        System.out.println(police(new int[]{8,6,7,5,9,1,1}));
    }
 
}



// tochararray example