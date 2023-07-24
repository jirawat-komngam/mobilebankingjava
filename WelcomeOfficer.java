import java.util.Scanner;

public class WelcomeOfficer implements Officer {
    private Scanner ear;
    private CreateAccountOfficer createAccountOfficer;

    WelcomeOfficer(CreateAccountOfficer realCreateAccountOfficer) {
        createAccountOfficer = realCreateAccountOfficer;
        ear = new Scanner(System.in);
    }

    public void call() {
        System.out.println("mobile banking");
        System.out.println("1 create account");
        System.out.println("2 account status");
        System.out.println("3 deposit/withdraw");
        System.out.println("4 transfer");
        String userInput = ear.nextLine();
        callOfficer(userInput);

    }

    public void callOfficer(String input) {
        if (input.equals("1")) {
            createAccountOfficer.call();
        }
    }
}
