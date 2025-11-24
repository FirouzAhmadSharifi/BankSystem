import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Customer name: ");
        String name = input.nextLine();

        while (true){
            System.out.println("\n Choose: deposit / withdraw / balance / exit: ");
            String choice = input.nextLine().toLowerCase();
            if (choice.equals("exit")) break;
            if (choice.equals("deposit")){
                System.out.println("Enter amount: ");
                double amount = input.nextDouble();
                input.nextLine();
                BankSystem.deposit(amount);
            } else if (choice.equals("withdraw")) {
                System.out.println("Enter amount: ");
                double amount = input.nextDouble();
                input.nextLine();
                BankSystem.withdraw(amount);
            } else if (choice.equals("balance")) {
                BankSystem.showBalance();
            }else {
                System.out.println("Invalid choice!");
            }
        }

        System.out.println("\n Thank you, "+ name + "!");
    }
}