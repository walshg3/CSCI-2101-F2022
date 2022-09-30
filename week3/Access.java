package week3;

public class Access {
    // default, public, private, protected
    // public, private - only covered in this class

    // public - anywhere in the program
    // private - only inside the class

    private String cat1 = "Appa";
    private String cat2 = "Momo";
    public String catPublic = "Doodler";
    private int catAge = 3;

    // Getter Method
    // When we make a Method
    // Scope, ReturnType, Name, Parameters
    public String getCat1() {
        return cat1;
    }
    public String getCat2() {
        return cat2;
    }
    public String getCatPublic() {
        return catPublic;
    } 
    public int getCatAge() {
        return catAge;
    }

    // Setter Method
    public void setCat1(String newName) {
        this.cat1 = newName;
    }
    // this - refers to the current object but it is not necessary
    public void setCat2(String newName) {
        cat2 = newName;
    }

    public void setCatAge(int newAge) {
        catAge = newAge;
    }



  
}
