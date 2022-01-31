import java.util.Scanner;
public class BankAccount {
    double withdraw;
    double deposit;
    double balance = 2000;
    int inputWithdrawConstructor;
    int inputDepositConstructor;
    int continueActions;
    public BankAccount(double toWithdraw, double toDeposit) {
        withdraw = toWithdraw;
        System.out.println("You withdrew: " + withdraw);
        deposit = toDeposit;
        System.out.println("You deposited: " + deposit);
        balance = balance - toWithdraw;
        balance = balance + toDeposit;
        System.out.println("Your balance is now: " + balance);
    }
    public BankAccount() {
        Scanner userInputWithdraw = new Scanner(System.in);
        System.out.println("Your balance is: " + balance);
        System.out.println("How much do you wish to withdraw? : ");
        String InputWithdraw = userInputWithdraw.nextLine();
        int IntInputWithdraw = Integer.valueOf(InputWithdraw);
        inputWithdrawConstructor = IntInputWithdraw;

        Scanner userInputDeposit = new Scanner(System.in);
        System.out.println("How much do you wish to deposit? : ");
        String InputDeposit = userInputDeposit.nextLine();
        int IntInputDeposit = Integer.valueOf(InputDeposit);
        inputDepositConstructor = IntInputDeposit;
    }
    public BankAccount(String diffConstructor) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Do you wish to do more actions? : ");
        String Input = userInput.nextLine();
        if (Input.toLowerCase().equals("yes")) {
            BankAccount input = new BankAccount();
            BankAccount bankAction1 = new BankAccount(input.inputWithdrawConstructor, input.inputDepositConstructor);
            BankAccount actionInp1 = new BankAccount("");
        }
    }
    public static void main(String[] args) {
        BankAccount input1 = new BankAccount();
        BankAccount action1 = new BankAccount(input1.inputWithdrawConstructor, input1.inputDepositConstructor);
        BankAccount actionInp1 = new BankAccount("");
    }
}
