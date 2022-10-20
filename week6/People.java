package week6;
public class People {
    // A person has a name, age, favorite color, and favorite food, SSN
    private String name;
    private int age;
    public String favoriteColor;
    public String favoriteFood;
    private int SSN;



    // Constructor
    public People(String name, int age, String favoriteColor, String favoriteFood, int SSN) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.favoriteFood = favoriteFood;
        this.SSN = SSN;
    }

    public People(String name) {
        this.name = name;
    }


    public void KillALLPEOPLE(People person){
        System.out.println("KILL ALL PEOPLE");
        person.name="DEAD";
        person.age=0;
        person.favoriteColor="BLACK";
    }
    // Either of these would work
    public String returnPerson(People person){
        return person.name;
    }
    public String returnName(){
        return name;
    }

    

    // Define Getters and Setters

    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public int getSSN() {
    //     return SSN;
    // }

    
}
