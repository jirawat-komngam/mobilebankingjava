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
        System.out.println("3 - transfer");
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
            System.out.println("withDraw : " + moneyAmount + " baht");
            System.out.println("confirm??");
            String confirmation = ear.nextLine();
            if (confirmation.equals("yes")) {
                System.out.println("withDraw  complete");
                System.out.println("withDraw " + moneyAmount + "baht");
                if (moneyAmount <= accountBalance) {
                    Double newBalance = accountBalance - moneyAmount;
                    System.out.println("balance :" + newBalance + "baht");
                    for (AccountPOJO eachAccount : accountDB.getAccountList()) {
                        if (eachAccount.getAccountInfo().containsKey(accountName)) {
                            eachAccount.setAccountBalance(newBalance);
                        }
                    }
                } else {
                    System.out.println("your money is not enough");
                }

            }

        } else if (choice.equals("3")) {
            System.out.println("transfer");
            System.out.println("amount of money");
            Double moneyAmount = Double.parseDouble(ear.nextLine());
            System.out.println("withDraw : " + moneyAmount + " baht");
            System.out.println("write reciever name");
            String recieverNameInput = ear.nextLine();
            System.out.println("confirm??");
            String confirmation = ear.nextLine();
            for (AccountPOJO eachAccount : accountDB.getAccountList()) {
                if (confirmation.equals("yes")) {
                    if (accountName.equals(recieverNameInput)) {
                        System.out.println("permission is denied");
                    } else {
                        if (eachAccount.getAccountInfo().containsKey(recieverNameInput)) {
                            System.out.println("tranfer  complete");
                            System.out.println("transfer " + moneyAmount + "baht");
                            if (moneyAmount <= accountBalance) {
                                Double newBalance = accountBalance - moneyAmount;
                                Double recieverBalance = accountBalance + moneyAmount;
                                System.out.println("balance :" + newBalance + "baht");
                                if (eachAccount.getAccountInfo().containsKey(accountName)) {
                                    eachAccount.setAccountBalance(newBalance);
                                }
                                if (eachAccount.getAccountInfo().containsKey(recieverNameInput)) {
                                    eachAccount.setAccountBalance(recieverBalance);
                                }
                            }
                        } else {
                            System.out.println("your money is not enough");
                        }
                    }

                } else {
                    System.out.println("not found this account");
                }
            }

        }
    }

}
