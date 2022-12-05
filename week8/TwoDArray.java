package week8;

public class TwoDArray {

    public static void main(String[] args) {
        System.out.println("Two Dimensional Array Example");
        // q: What is a two dimensional array?
        // a: A two dimensional array is an array of arrays
        // q: How do we declare a two dimensional array?
        // a: We declare a two dimensional array by using two sets of brackets
        // q: Can you show me an example?
        int[][] twoDArray = new int[3][3];
        // XXX
        // XXX
        // XXX
        
        // Notice that we have two sets of brackets
        // The first set of brackets is for the rows
        // The second set of brackets is for the columns

        // q: How do we access the elements of a two dimensional array?
        // a: We access the elements of a two dimensional array by using two sets of
        // brackets
        // q: Can you show me an example?
        twoDArray[0][0] = 1;
        twoDArray[0][1] = 2;
        twoDArray[0][2] = 3;
        twoDArray[1][0] = 4;
        twoDArray[1][1] = 5;
        twoDArray[1][2] = 6;
        twoDArray[2][0] = 7;
        twoDArray[2][1] = 8;
        twoDArray[2][2] = 9;
        // q: How do we print the elements of a two dimensional array?
        // a: We print the elements of a two dimensional array by using two for loops
        // q: Can you show me an example?
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.println("Element at index - " + i + ", " + j + ": " + twoDArray[i][j]);
            }
        }
        // q: How do we print the elements of a two dimensional array using a for each
        // loop?
        // a: We print the elements of a two dimensional array using a for each loop by
        // using two for each loops
        // q: Can you show me an example?
        for (int[] i : twoDArray) {
            for (int j : i) {
                System.out.println("Element: " + j);
            }
        }

        // Lets show an example with Clothing and get the total counts of the clothes for each brand
        // Arrays can have 2 dimensions
        int BRANDS = 7;
        int TYPES = 3;
        // ROW X COLUMN
        // All values are init with 0 by default for int Arrays
        // All values are init with null by default for String Arrays
        int[][] sales = new int[BRANDS][TYPES];
        // 3X7
        // 000
        // 000
        // 000
        // 000
        // 000
        // 000
        // 000

        String[] brands = {
                "Abercrombie",
                "Hollister",
                "American Eagle",
                "Polo Ralph Lauren",
                "H&M",
                "Nike",
                "Adidas"
        };

        // we can also create an array using row column format
        // shirts pants jackets
        int[][] counts = { 
            // shirts pants jackets
                { 2, 4, 3 }, // Abercrombie
                { 3, 2, 1 }, // Hollister
                { 1, 2, 3 }, // American Eagle
                { 2, 3, 1 }, // Polo Ralph Lauren
                { 3, 1, 2 }, // H&M
                { 1, 3, 2 }, // Nike
                { 2, 1, 3 } // Adidas
        };

        // to access all elements of the 2D array you use nested for loops
        for(int i = 0; i < BRANDS; i++){
            for(int j = 0; j < TYPES; j++){
                // process the jth column of the ith row
                System.out.printf("%8d", counts[i][j]);
                // System.out.println("Brand: " + brands[i] + " Type: " + counts[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");


        // Lets try to print the brands and the number of shirts they have
        // Abercrombie has 2 shirts
        // Hollister has 3 shirts
        // American Eagle has 1 shirts
        // Polo Ralph Lauren has 2 shirts
        // H&M has 3 shirts
        // Nike has 1 shirts
        // Adidas has 2 shirts
        for(int i = 0; i < BRANDS; i++){              // ROW X COLUMN
            System.out.println(brands[i] + " has " + counts[i][0] + " shirts");
        }

        // Lets print a pretty grid output
        System.out.println("               Brand         Shirt    Pant    Jacket     Total");
        System.out.println("-----------------------------------------------------------------");
        for(int i = 0; i < BRANDS; i++){
            // q: what does the s do in printf
            // a: %s is a placeholder for a string
            // q: what does the d do in printf
            // a: %d is a placeholder for a decimal
            System.out.printf("%20s", brands[i]);
            int total = 0;
            for(int j = 0; j < TYPES; j++){        // ROW X COLUMN
                System.out.printf("%10d", counts[i][j]);
                total += counts[i][j];
            }
            System.out.printf("%10d", total);
            System.out.println();
        }
        // Array Lists can have 2 dimensions but they are harder to create.... We need to learn what an Array List is first
    }
}
