import java.util.Scanner;

public class CreateAccountOfficer implements Officer {
    private Scanner ear;

    CreateAccountOfficer() {
        ear = new Scanner(System.in);
    }

    public void call() {
        System.out.println("-create account");
        System.out.println("account name");
        String accountNameInput = ear.nextLine();
        System.out.println("account password");
        String accountPasswordInput = ear.nextLine();
        System.out.println("confirm Password");
        String confirmPasswordInput = ear.nextLine();
        System.out.println("deposit");
        Double accountMoneyInput = Double.parseDouble(ear.nextLine());
        System.out.println("account created");
    }

}
