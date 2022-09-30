package week3;

import week2.Playground;

public class CatNames {
    // String catName3 = "Jack";
    static String catName3 = "Jack";
    public static void main(String[] args) {
        System.out.println("We got cats yall");
        String catTest = "Greg";
        System.out.println(catTest);
        System.out.println(catName3);
        // initialize an object
        // NameOfFile NameOfObject = new NameOfConstructor();
        Access a = new Access();
        System.out.println(a.catPublic);
        System.out.println(a.getCat1());
        System.out.println(a.getCat2());
        System.out.println(a.getCatPublic());
        a.catPublic = "Poopsie";
        System.out.println(a.getCatPublic());
        System.out.println("My cat's are " + a.getCatAge() + " years old");
        System.out.println("1 Year later...");
        a.setCatAge(4);
        System.out.println("My cat's are " + a.getCatAge() + " years old");
        
        // a.getCat1() = "Poopsie";
        // // "Edison"
        String newCatName = "Edison";
        a.setCat1(newCatName);
        System.out.println(a.getCat1());
        a.setCat2(newCatName);
        System.out.println(a.getCat2());

        Playground p = new Playground();

        p.addExclamationPoint(newCatName);
        // static methods can be accessed without an object
        Playground.addExclamationPoint(newCatName);




    }
}
