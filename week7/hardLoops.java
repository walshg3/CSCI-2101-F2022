package week7;

public class hardLoops {



    // Given a non-empty String and an int N, return the string made starting with char 0, and then ever Nth char of the String. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more. 
    // everyNth("Miracle", 2) → "Mrce"
    // Miracle
    // 0123456
    // Mrce

    public static String everyNth(String str, int n) {
        String out = "";
        for (int i = 0; i < str.length(); i = i + n) { // i+=n
            out += str.charAt(i);
        }
        return out;
    }



    // given a string create a new string that will move the first char to the end of the following 2 chars
    // EX.
    // oneTwo("abc") → "bca"
    // oneTwo("tca") → "cat"
    // oneTwo("tcagdo") → "catdog"
    // Miracle
    // 0123456
    // Length of 7
    // Take M and store it for later
    // i
    // ir
    // irM -> Drop the M here
    public static String oneTwo(String str) {
        String out = ""; // temp string to hold the new string
        System.out.println(str.length());
        for (int i = 0; i < str.length() - 2; i += 3) {
            out += str.substring(i + 1, i + 3) + str.charAt(i);
            // Remember += is the same as below
            // out = out + str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return out;
    }

    // Palindrome
    // racecar
    // mom
    // tacocat
    // Create a palindrome checker that will check if a word is a palindrome
    // EX.
    // isPalindrome("racecar") → true
    // isPalindrome("mom") → true
    // isPalindrome("tacocat") → true
    // isPalindrome("hello") → false
    // ABBA
    public static boolean isPalindrome(String str) {
        // loop through the string and compare the first and last char
        // if they are the same, then move to the next char
        // if they are not the same, then return false
        // if the loop finishes, then return true
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) { // this is an example of a forward pointer and backward pointer
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeWhile(String str){

        //Pointers pointing to the beginning and the end of the string
        int i = 0;
        int j = str.length()-1;

        // while there are characters to compare
        while(i < j){
            // if there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
            // Increment first pointer and decrement the other pointer
            i++;
            j--;
        }
        // tacocat
        // 0123456
        // length = 7
        // test
        // 0123
        // length = 4 
        return true;
    }

    // count the number of times xx is in a give string then return the number of times
    // EX.
    // countXX("abcxx") → 1
    // countXX("xxx") → 2
    // countXX("xxxx") → 3
    // countXX("abc") → 0
    // countXX("Hello there") → 0
    // countXX("Hexxo thxxe") → 2
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }
    // count the number of times xx is in a given string
    // countXX("Hapxxpy Birtxxhday") -> 2
    public static int countXXGW(String str){
        int count = 0; 
        //HapxxpyBxx
        //0123456789
        for (int i = 0; i < str.length()-1; i++) {
            // System.out.println(str.charAt(i) +" "+ str.charAt(i+2));
            if(str.substring(i, i+2).equalsIgnoreCase("xx")){
                count ++;
            }
            // i = 0
            // 0-2 -> Hap
        }
        return count;
    }



    public static void main(String[] args) {
        String output = everyNth("Miracle", 2);
        System.out.println(output);
        System.out.println(oneTwo("Miracle"));
        System.out.println(isPalindrome("class"));
        System.out.println(countXX("xxcxxxlaxxssxx"));
    }

}
