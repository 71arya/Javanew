
import java.util.*;
class Account {
    int accNo;
    float balance;
     int timePeriod;
    private static float intRateInYears = 7.5f;

    
    Account(int accNo, float balance, int timePeriod) {
        this.accNo = accNo;
        this.balance = balance;
        this.timePeriod = timePeriod;
    }

    
    float calculateInterest() {
        float interest = (balance * intRateInYears * timePeriod) / 100;
        return interest;
    }

    
     void showAccDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Amount: $" + calculateInterest());
        System.out.println();
	}
    static void changeIntRate(float newRate) {
        intRateInYears = newRate;
        System.out.println("Interest rate changed to " + newRate + "%");
    }
}

class new4 {
    public static void main(String[] args) {
       
        Account[] accounts = new Account[3];
        accounts[0] = new Account(1001, 5000, 2);
        accounts[1] = new Account(1002, 8000, 3);
        accounts[2] = new Account(1003, 10000, 1);

        
        System.out.println("Account Details Before Interest Rate Change:");
        for (Account acc : accounts) {
            acc.showAccDetails();
        }

        
        Account.changeIntRate(8.0f);

        
        System.out.println("Account Details After Interest Rate Change:");
        for (Account acc : accounts) {
            acc.showAccDetails();
        }
    }
}