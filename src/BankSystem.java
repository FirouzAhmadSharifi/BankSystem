public class BankSystem {
    static double balance = 0;

    // deposit using int
    public static void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // deposit using double
    public static void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    // withDraw
    public static void  withdraw(double amount){
        balance -= amount;
        System.out.println("WithDraw : " + amount);
    }
    // show balance
    public static void showBalance(){
        System.out.println("Current Balance: " + balance);
    }
}
