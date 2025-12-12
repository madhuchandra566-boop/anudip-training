class Bank {
    double amount;  

    Bank(double amount) {
        this.amount = amount;
    }

    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) 
                         ? "Withdrawal successful" 
                         : "Insufficient balance";

        System.out.println(message);

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount; // update amount after withdrawal
        }
    }

    void deposit(double depositAmount) {
        amount += depositAmount;  // update amount after deposit
    }

    void displayBalance() {
        System.out.println("After deposit, available balance: " + amount);
    }

    public static void main(String[] args) {
        Bank b = new Bank(10000);   // initialize amount to 10000

        System.out.println("Withdrawal amount = 5000");
        b.withdraw(5000);

        System.out.println("Deposit amount = 5000");
        b.deposit(5000);

        b.displayBalance();
    }
}
