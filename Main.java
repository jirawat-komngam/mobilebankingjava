class Program {
    public void start() {
        AccountDB database = new AccountDB();
        CreateAccountOfficer newCreateAccountOfficer = new CreateAccountOfficer(database);
        WelcomeOfficer newWelcomeOfficer = new WelcomeOfficer(newCreateAccountOfficer);
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