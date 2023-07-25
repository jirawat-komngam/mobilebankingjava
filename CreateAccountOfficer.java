import java.util.*;

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
        if (accountNameInput.equals(confirmPasswordInput)) {
            System.out.println("deposit");
            Double accountMoneyInput = Double.parseDouble(ear.nextLine());
            AccountPOJO newAccount = new AccountPOJO(null, accountMoneyInput);
            Map userNamePassword = new HashMap();
            userNamePassword.put(accountNameInput, accountPasswordInput);
            newAccount.setAccountInfo(userNamePassword);
            newAccount.setAccountBalance(accountMoneyInput);
            accountDB.getAccountList().add(newAccount);
            System.out.println("account created");
        } else {
            System.out.println("your password not equal confirmpassword");
        }
    }

}
