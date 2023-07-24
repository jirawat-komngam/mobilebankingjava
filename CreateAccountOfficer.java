import java.util.Scanner;

public class CreateAccountOfficer implements Officer {
    private Scanner ear;
    private AccountDB accountDB;

    CreateAccountOfficer(AccountDB realAccountDB) {
        ear = new Scanner(System.in);
        this.accountDB = realAccountDB;
    }

    public void call() {
        System.out.println("-create account");
        System.out.println("account name");
        String accountNameInput = ear.nextLine();
        System.out.println("account password");
        String accountPasswordInput = ear.nextLine();
        System.out.println("confirm Password");
        String confirmPasswordInput = ear.nextLine();
        System.out.println("deposit");
        Double accountMoneyInput = Double.parseDouble(ear.nextLine());
        AccountPOJO newAccountData = createAccount(accountNameInput, confirmPasswordInput, accountMoneyInput);
        accountDB.getAccountList().add(newAccountData);
        System.out.println("account created");
    }

    public AccountPOJO createAccount(String nameInput, String passwordInput, Double moneyInput) {
        AccountPOJO newAccount = new AccountPOJO();
        newAccount.setAccountName(nameInput);
        newAccount.setAccountPassword(passwordInput);
        newAccount.setAccountBalance(moneyInput);
        return newAccount;
    }
}
