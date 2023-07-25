import java.util.Scanner;

public class WelcomeOfficer implements Officer {
    private Scanner ear;
    private CreateAccountOfficer createAccountOfficer;
    private AskAccountOfficer askAccountOfficer;

    WelcomeOfficer(CreateAccountOfficer realCreateAccountOfficer, AskAccountOfficer realAskAccountOfficer) {
        createAccountOfficer = realCreateAccountOfficer;
        askAccountOfficer = realAskAccountOfficer;
        ear = new Scanner(System.in);
    }

    public void call() {
        while (true) {
            System.out.println("mobile banking");
            System.out.println("1 create account");
            System.out.println("2 login");
            String userInput = ear.nextLine();
            callOfficer(userInput);
        }

    }

    public void callOfficer(String input) {
        if (input.equals("1")) {
            createAccountOfficer.call();
        } else if (input.equals("2")) {
            askAccountOfficer.call();
        }
    }
}
