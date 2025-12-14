interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    void checkBalance();
}
class DBBL implements ATMService {

    double balance;

    DBBL(double balance) {
        this.balance = balance;
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Successful! Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful! New Balance: " + balance);
    }
    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        DBBL atm = new DBBL(5000);
        atm.checkBalance();
        atm.deposit(1500);
        atm.withdraw(3000);
        atm.checkBalance();
    }
}

