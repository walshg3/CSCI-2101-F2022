package week4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Person p1 = new Person("Gina"); // instantiate a Person object


        System.out.println(p1.name);  // Access p1's name

        System.out.println(p1.getName()); // Access p1's name using a getter
        // We dont NEED to do this because name is a Public variable
        // But we do it anyway because it's good practice


        System.out.println(p1.age);

        Person p2 = new Person(); // instantiate a Person object
        System.out.println(p2.name);  // Access p2's name
        Person p3 = new Person("Alex", 30); // instantiate a Person object with name and age

        Person p4 = new Person("Bob", 22, "Black", 200.0); // instantiate a Person object with name, age, favColor, giftTotal
        System.out.println(Person.welcomeMessage());
        System.out.println(p1.welcomeMessagePersonal(p1.getName()));// call the welcomeMessage method on p1
        System.out.println(p3.welcomeMessagePersonalAge(p3.getName(), p3.age));// call the welcomeMessage with age method on p3


        System.out.println(Person.count); // Access the static variable count

        System.out.println(p4.welcomeMessagePersonAgeWithGift(p4.getName(), p4.age, p4.giftTotal));

        System.out.println(p4.newColor(p4.favColor));
        System.out.println(p4.newColorBetween(p4.favColor));
        System.out.println(p4.newColorString(p4.favColor));
    
    }
}
