import java.util.ArrayList;

class BankAccount {

    private double balance;
    private ArrayList <String> history = new ArrayList<>();
    private final int PIN = 1228;

    public BankAccount(double start){
        this.balance = start;
        history.add("Account Opened with: $" + start);
    }

    public boolean checkPIN(int input) { return PIN == input; }

    public double getBalance() { return balance; }


    public ArrayList<String> getHistory(){ return history; }

    public void deposit (double money){
        balance += money;
        history.add("Deposit: $" + money);
    }
    public boolean withdraw(double money){
        if (money > 0 && money <= balance) {
            balance -= money;
            history.add("Withdraw: $" + money);
            return true;
        }
        return false;
    }
}
