class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setAccountHolder("Isteak Ahmad");
        acc.setAccountNumber("30211210000****");
        acc.setBalance(41500.50);

        System.out.println("Bank Account Information:");
        acc.showAccountInfo();
}
}

