package week7;

public class ForTester {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // for (initialization; condition; increment)
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        int students = 22; 
        // Count up for each student until the 22nd student is checked
        for (int i = 0; i < students; i++) {
            int outStudent = i + 1;
            System.out.println("Hello Welcome in Student: "+ outStudent);
        }
        String s = "thequickbrownFoxjumpedoverthelazydogFromthebackoFthebus";
        
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        if(s.charAt(0) == 'F'){
            System.out.println("Found F");
        }else if (s.charAt(1) == 'F'){
            System.out.println("Found F");
        }

        System.out.println(s.length());
        // Find the first F in the string
        // for (initialization; condition; increment)
        // length is 36
        // 0 -> i = t
        // 1 -> i = h

        // int count = 0;

        // for (int i = 0; i < s.length(); i++) {
        //     // System.out.println("Checking: " + s.charAt(i));
        //     if(s.charAt(i) == 'F'){
        //         count++;
        //         System.out.println("Found F at position: " + i);
        //         // break;
        //     }
        //     // System.out.println("Not Found F.. checking next character");
        
        // }

        // System.out.println("Found F: " + count + " times");

        // Let try to make this into a method
        // Find the total X chars in a string
        
        // HOW TO LINK 2 FILES TOGETHER IN JAVA
        // THIS IS CALLED INIALIZING AN OBJECT
        // FORHELPER IS THE CLASS
        // FORTESTER IS THE FILE
        // helper IS THE OBJECT
        ForHelper helper = new ForHelper();

        // String out = helper.countXchars(s, 'F');
        // System.out.println(out);
        System.out.println(helper.countXchars(s, 'F'));
        String s2 = "This class is really boring on Tuesdays but Kinda cool on Thursdays so thats why I said not to have class on Tuesday and also go vote!";
        System.out.println(helper.countXchars(s2, 'a'));

        // helper.sumUserInput();
        helper.nestedForLoop();
    }
    
}
