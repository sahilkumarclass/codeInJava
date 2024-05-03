
class Account{
    private String accountNumber;
    protected double balance;
    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount){
        this.balance+=amount;
        displayBalance();
    }

    void withdraw(double amount){
        if (amount<=balance){
            this.balance-=amount;
            System.out.println("Withdrawl Amount : " + amount);
        }
        else {
            System.out.println("Withdrwal amount exceeed balance");
        }
        displayBalance();
    }

    void calculateInterest(){
        double interest;
        interest = (this.balance * 5) /100;
        System.out.println("Interest for one year : " + interest);
    }

    void TransferFunds(Account destinationAccount, double amount){
        if(amount<=balance){
            withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transaction Successful");
        }
        else {
            System.out.println("Transaction Not Successful");
        }
    }

    void displayBalance(){
        System.out.println( "AccountNumber " + this.accountNumber + " - Balance : " + this.balance);
    }
}

class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }

    @Override
    void calculateInterest(){
        double interest;
        interest = (this.balance * this.interestRate) /100;
        System.out.println("Interest for one year : " + interest);
    }

}

class WithdrawlAccount extends Account{
    private double withdrawlLimit;

    public WithdrawlAccount(String accountNumber, double balance, double withdrawlLimit){
        super(accountNumber,balance);
        this.withdrawlLimit = withdrawlLimit;
    }

    @Override
    void withdraw(double amount){
        if (amount<=balance + withdrawlLimit){
            this.balance-=amount;
            System.out.println("Withdrawl Amount : " + amount);
        }
        else {
            System.out.println("Withdrwal amount exceeed balance+ withdrawlLimit");
        }
        displayBalance();
    }

}



public class ProblemDemo {
    public static void main(String[] args) {
        Account Govind = new Account("ABC123",1000);

        SavingsAccount Mohit = new SavingsAccount("XYZ789",1000,8);

//        WithdrawlAccount a = new WithdrawlAccount("DEF",1000,500);
//        a.withdraw(1600);
//
//        Govind.TransferFunds(Mohit,100);
        Govind.TransferFunds(Mohit,200);
    }
}
