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
            Double moneyAmount = Double.parseDouble(ear.nextLine());
            System.out.println("deposit : \"500 baht\"\r\n" + //
                    "");
            System.out.println("confirm??");
            String confirmation = ear.nextLine();
            if (confirmation.equals("yes")) {
                System.out.println("deposit complete");
                System.out.println("deposit 500 baht");
                System.out.println("balance 1500 baht");
            }

        } else if (choice.equals("2")) {
            System.out.println("withdraw");
            System.out.println("amount of money");
            Double moneyAmount = Double.parseDouble(ear.nextLine());
            System.out.println("withdraw : \"500 baht\"\r\n" + //
                    "");
            System.out.println("confirm??");
            String confirmation = ear.nextLine();
            if (confirmation.equals("yes")) {
                System.out.println("withdraw complete");
                System.out.println("withdraw 500 baht");
                System.out.println("balance 1000 baht");
            }

        }

    }
}
