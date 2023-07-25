import java.util.Scanner;

public class AskAccountOfficer implements Officer {
    private Scanner ear;
    private AccountDB accountDB;

    AskAccountOfficer(AccountDB realAccountDB) {
        ear = new Scanner(System.in);
        this.accountDB = realAccountDB;
    }

    public void call() {
        System.out.println("login success");
        System.out.println("account name");
        String realPasswordInput = "";
        String accountNameInput = ear.nextLine();
        for (AccountPOJO eachAccount : accountDB.getAccountList()) {
            if (eachAccount.getAccountInfo().containsKey(accountNameInput) == true) {
                System.out.println("account password");
                String accountPasswordInput = ear.nextLine();
                realPasswordInput = eachAccount.getAccountInfo().get(accountNameInput);
                if (accountPasswordInput.equals(realPasswordInput)) {
                    System.out.println("login success");
                }
            }
        }

    }
}
