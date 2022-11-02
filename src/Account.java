import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0.0d;
    private final Date dateCreated;

    public Account(){
        this.id=0;
        this.balance=0.0d;
        this.dateCreated = new Date();
    }

    public Account(int id, double initialBalance){
        this.id=id;
        this.balance=initialBalance;
        this.dateCreated = new Date();
    }

    public void setID(int id){
        this.id=id;
    }

    public int getID(){
        return this.id;
    }

    public void withdraw(double withdraw) {
        this.balance-=withdraw;
    }

    public void deposit(double deposit) {
        this.balance+=deposit;
    }

    public String getBalance() {
        return Double.toString(this.balance);
    }

    public static void setAnnualInterestRate(double interestRate) {
        Account.annualInterestRate = interestRate/100d;
    }

    public static double getAnnualInterestRate() {
        return Account.annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public static double getMonthlyInterestRate(){
        return Account.getAnnualInterestRate()/12.0d;
    }

    public String getMonthlyInterest() {
        return Double.toString(Account.getMonthlyInterestRate()*this.balance);
    }
}


class TestingAccount {
    public static void main (String[] args) {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly interest is " +
                account.getMonthlyInterest());
        System.out.println("This account was created at " +
                account.getDateCreated());
    }
}
