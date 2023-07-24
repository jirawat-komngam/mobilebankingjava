class Program {
    public void start() {
        WelcomeOfficer welcomeOfficer = new WelcomeOfficer();
        welcomeOfficer.call();
    }

}

public class Main {

    public static void main(String[] args) {
        Program program = new Program();
        program.start();
    }
}