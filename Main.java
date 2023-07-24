class Program {
    public void start() {
        WelcomeOfficer newWelcomeOfficer = new WelcomeOfficer();
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