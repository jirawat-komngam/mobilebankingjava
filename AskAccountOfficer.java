import java.util.*;

public class AskAccountOfficer implements Officer {
    private Scanner ear;
    private AccountDB accountDB;
    private AccountServiceOfficer accountServiceOfficer;

    AskAccountOfficer(AccountDB realAccountDB, AccountServiceOfficer realaccountServiceOfficer) {
        ear = new Scanner(System.in);
        this.accountDB = realAccountDB;
        this.accountServiceOfficer = realaccountServiceOfficer;
    }

    public void call() {
        System.out.println("login success");
        System.out.println("account name");
        String realPasswordInput = "";
        Double balance = 0.0;
        String accountNameInput = ear.nextLine();
        for (AccountPOJO eachAccount : accountDB.getAccountList()) {
            if (eachAccount.getAccountInfo().containsKey(accountNameInput) == true) {
                System.out.println("account password");
                String accountPasswordInput = ear.nextLine();
                realPasswordInput = eachAccount.getAccountInfo().get(accountNameInput);
                if (accountPasswordInput.equals(realPasswordInput)) {
                    balance = eachAccount.getAccountBalance();
                    System.out.println("login success");
                    accountServiceOfficer.call(accountNameInput, balance);

                }
            }
        }

    }

}
