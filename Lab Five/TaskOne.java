class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "Islami Bank";

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void showAccountInfo() {
        System.out.println("Bank Name        : " + bankName);
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Balance          : " + balance);
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("1501", "Isteak", 9000);
        BankAccount acc2 = new BankAccount("1598", "Rakib", 6000);

        System.out.println(" Account 1 Information ");
        acc1.showAccountInfo();

        System.out.println(" Account 2 Information ");
        acc2.showAccountInfo();

        System.out.println(" Bank Information ");
        BankAccount.showBankName();
    }
}

