package week8;

public class CharArray {

    // Char arrays are used to store multiple characters in a single variable
    // Char Array Example
    public static void main(String[] args) {
        // showing toCharArray() method
        String str = "Hello";
        char[] charArray = str.toCharArray();

        charArray[0] = 'J';
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
