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

    public static void main(String[] args) {
        String output = everyNth("Miracle", 2);
        System.out.println(output);
    }
    
}
