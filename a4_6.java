import java.util.*;
class acc
{
int accno;
float balance;
int time;
static float roi=7.5f;
 int account (int accno,int balance,int time)
{
this.accno=accno;
this.balance=balance;
this.time=time;
}
 float calculateInterest() {
        float interest = (balance * roi* time) / 100;
        return interest;
}
 void Details() {
        System.out.println("Account Number: "+ accno);
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
      for(int i=0;i<3;i++)
accounts[i]=new account(); 
for( int i=0;i<3;i++)
{
accounts[i].input();
}
for(int i=0;i<3;i++)
{
account[i].display();
}
System.out.println("Account Details Before Interest Rate Change:");
        for (Account acc : accounts) {
            account.Details();
        }

        
        Account.changeIntRate(8.0f);

        
        System.out.println("Account Details After Interest Rate Change:");
        for (Account acc : accounts) {
            acc.Details();
        }
    }
}