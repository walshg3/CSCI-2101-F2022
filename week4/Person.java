package week4;

public class Person {
    // this is a Person class
    // this is a blueprint for a Person object
    // this is a template for a Person object
    public String name = "";
    public String namecatsdogs; // another way to declare a variable
    public int age = 21;
    public String favColor = "";
    public double giftTotal = 0.0;
    public static int count = 0; // static variable 
    // static variables are shared by all objects of the class

    public Person(String name) {
        this.name = name;
        count++;
    }

    public Person(){
        name = "Rob";
        count ++;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        count ++;
    }

    public Person(String name, int age, String favColor, double giftTotal){
        this.name = name;
        this.age = age;
        this.favColor = favColor;
        this.giftTotal = giftTotal;
        count ++;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public static String welcomeMessage(){
        return "Welcome in Grab a Drink!";
    }
    public String welcomeMessagePersonal(String name){
        return "Welcome in Grab a Drink, " + name + "!";
    }

    public String welcomeMessagePersonalAge(String name, int age){
        return "Welcome in Grab a Drink, " + name + "!" + " I cant believe you are " + age + " years old.";
    }

    public String welcomeMessagePersonAgeWithGift(String name, int age, double giftTotal){
        return "Welcome in Grab a Drink, " + name + "!" + " I cant believe you are " + age + " years old." + " You have given us $" + giftTotal + " in gifts!";
    }
// Black
// 01234
// lack
// 0123
    public String newColor(String favColor){
        return favColor.substring(1);
        // Black
        // lack
    } 
    public String newColorBetween(String favColor){
        return favColor.substring(1, 3);
        // Black
        //  la
        // 0la3
        // index 1 - 3 but not including 3
    }
    public String newColorString(String favColor){
        String newString = favColor.substring(1, 3) + "Cheese";
        return newString;
    }
    // Return String backwards
    public String backwardString(String favColor){
        String newString = "";
        return newString;
        // We dont know how to use for loops yet but 
        // we will come back to this

        // for(int i = favColor.length() - 1; i >= 0; i--){
        //     newString += favColor.charAt(i);
        // }
        // return newString;

        // we dont know how to use String Builder yet 
        // But when we do
        // https://favtutor.com/blogs/reverse-string-java#:~:text=To%20reverse%20a%20string%20in,you%20with%20the%20final%20output.
    }


}
