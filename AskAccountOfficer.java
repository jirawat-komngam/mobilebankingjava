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
        String accountNameInput = ear.nextLine();
        System.out.println("account password");
        String accountPasswordInput = ear.nextLine();

        System.out.println("login success");    
    }
}
