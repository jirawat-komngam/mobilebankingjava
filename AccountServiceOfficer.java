import java.util.Scanner;

public class AccountServiceOfficer {
    private Scanner ear;
    private AccountDB accountDB;

    AccountServiceOfficer(AccountDB realAccountDB) {
        this.accountDB = realAccountDB;
        ear = new Scanner(System.in);
    }

    public void call(String accountName, Double accountBalance) {

        System.out.println("welcome : " + accountName);
        System.out.println("balance : " + accountBalance + " baht");
        System.out.println("1 - deposit");
        System.out.println("2 - withdraw");
        String userChoiceValues = ear.nextLine();
        userChoice(userChoiceValues, accountName, accountBalance);
    };

    public void userChoice(String choice, String accountName, Double accountBalance) {
        if (choice.equals("1")) {
            System.out.println("deposit");
            System.out.println("amount of money");
            Double moneyAmount = Double.parseDouble(ear.nextLine());
            System.out.println("deposit : " + moneyAmount + " baht");
            System.out.println("confirm??");
            String confirmation = ear.nextLine();
            if (confirmation.equals("yes")) {
                System.out.println("deposit complete");
                System.out.println("deposit" + moneyAmount + "baht");
                Double newBalance = moneyAmount + accountBalance;
                System.out.println("balance :" + newBalance + "baht");
                for (AccountPOJO eachAccount : accountDB.getAccountList()) {
                    if (eachAccount.getAccountInfo().containsKey(accountName)) {
                        eachAccount.setAccountBalance(newBalance);
                    }
                }
            }

        }

        else if (choice.equals("2")) {
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
