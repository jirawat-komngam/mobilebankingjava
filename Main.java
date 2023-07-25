import java.util.ArrayList;

class Program {
    public void start() {
        AccountDB database = new AccountDB(new ArrayList<>());
        CreateAccountOfficer newCreateAccountOfficer = new CreateAccountOfficer(database);
        AccountServiceOfficer newAccountServiceOfficer = new AccountServiceOfficer();
        AskAccountOfficer newAskAccountOfficer = new AskAccountOfficer(database, newAccountServiceOfficer);
        WelcomeOfficer newWelcomeOfficer = new WelcomeOfficer(newCreateAccountOfficer, newAskAccountOfficer);
        Bank newBank = new Bank(newWelcomeOfficer);
        newBank.enterBank();
    }

}

public class Main {

    public static void main(String[] args) {
        Program program = new Program();
        program.start();
    }
}