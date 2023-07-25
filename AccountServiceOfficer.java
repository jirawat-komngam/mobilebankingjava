import java.util.Scanner;

public class AccountServiceOfficer implements Officer {
    private Scanner ear;
    private AccountDB accountDB;

    AccountServiceOfficer(AccountDB realAccountDB) {
        this.accountDB = realAccountDB;
        ear = new Scanner(System.in);
    }

    public void call() {

        System.out.println("welcome : kuy");
        System.out.println("balance : 1000 baht");
        System.out.println("1 - deposit");
        System.out.println("2 - withdraw");

    };

    public void userChoice(String choice) {
        if (choice.equals("1")) {
            System.out.println("deposit");
            System.out.println("amount of money");
        }
    }
}
