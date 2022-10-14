package week6;

public class BankAccountTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Account Tester");
        // Create a new BankAccount object
        // ClassName NAME = new ClassName(ARGUMENTS);
        BankAccount account1 = new BankAccount("Bob", 100);
        // System.out.println(account1.name);
        System.out.println(account1.getName());
        System.out.println(account1.getBalance());
        BankAccount blankAccount = new BankAccount();
        System.out.println(blankAccount.getName());
        blankAccount.setName("Greg");
        System.out.println(blankAccount.getName());
        account1.deposit(100);
        System.out.println(account1.getBalance());
        blankAccount.deposit(1000);
        System.out.println(blankAccount.printBalance());
        blankAccount.withdraw(600);
        System.out.println(blankAccount.printBalance());
        blankAccount.monthlyFee(10);
        System.out.println(blankAccount.printBalance());

        

    }
}
