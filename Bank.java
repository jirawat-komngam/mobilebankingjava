public class Bank implements Company {

    private WelcomeOfficer welcomeOfficer;

    Bank(WelcomeOfficer externalWelcomeOfficer) {
        welcomeOfficer = externalWelcomeOfficer;
    }

    public void enterBank(){
        welcomeOfficer.call();
    }
}
