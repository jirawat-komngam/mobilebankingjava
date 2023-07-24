import java.util.Scanner;

public class WelcomeOfficer implements Officer {
    private Scanner ear;
    private CreateAccountOfficer createAccountOfficer;

    WelcomeOfficer(CreateAccountOfficer realCreateAccountOfficer) {
        createAccountOfficer = realCreateAccountOfficer;
    }

    public void call() {
        System.out.println("mobile banking");
        System.out.println("1 create account");
        System.out.println("2 account status");
        System.out.println("3 deposit/withdraw");
        System.out.println("4 transfer");
        String userInput = ear.nextLine();

    }

}
