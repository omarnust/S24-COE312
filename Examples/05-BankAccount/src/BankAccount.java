
class BankAccount {
    private int balance;
    
    public BankAccount(int balance) {
        this.balance = balance;
    }
    
    public synchronized void deposit(int amount) {
        balance += amount;
    }
    
    public synchronized void withdraw(int amount) throws Exception {
        if (balance < amount) {
            System.out.println("Insufficient funds!");
        }
        balance -= amount;
    }
    
    public synchronized int getBalance() {
        return balance;
    }
}

