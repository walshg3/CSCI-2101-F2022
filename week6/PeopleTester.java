package week6;

import week4.Person;

public class PeopleTester {

    public static void main(String[] args) {
        System.out.println("Welcome to the People Tester");


        // Make a Person Object
        // ClassName NAME = new ClassName(ARGUMENTS);
        People p = new People("Bob", 20, "Blue", "Pizza", 123456789);

        System.out.println(p.favoriteColor);
        System.out.println(p.returnPerson(p));

        p.KillALLPEOPLE(p);
        System.out.println(p.returnPerson(p));

    }
    
}
