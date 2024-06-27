class Account {
    String customerName;
    int accountNumber;
    Account(String name, int accNumber) {
        this.customerName = name;
        this.accountNumber = accNumber;
    }
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}
class Savings_Account extends Account {
    double minBalance;
    double savingBalance;

    Savings_Account(String name, int accNumber, double minBal, double savingBal) {
        super(name, accNumber);
        this.minBalance = minBal;
        this.savingBalance = savingBal;
    }

    void show() {
        super.display();
        System.out.println("Minimum Balance: " + minBalance);
        System.out.println("Saving Balance: " + savingBalance);
    }
}

class Account_details extends Savings_Account {
    double deposit;
    double withdrawal;

    Account_details(String name, int accNumber, double minBal, double savingBal, double deposit, double withdrawal) {
        super(name, accNumber, minBal, savingBal);
        this.deposit = deposit;
        this.withdrawal = withdrawal;
    }

    void show1() {
        super.show();
        System.out.println("Deposited Amount: " + deposit);
        System.out.println("Withdrawn Amount: " + withdrawal);
    }
}

class a5_5 {
    public static void main(String[] args) {
        Account_details details = new Account_details("John Doe", 101, 100, 500, 2700, 59);
        details.show1();
    }
}
