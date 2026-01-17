package ClassAndObjectsBasics.BankAccountLite;

public class BankAccountLite {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccountLite(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount < 0){
            System.out.println("You have entered an invalid amount to deposit");
        }
        else{
            balance = balance + depositAmount;
            System.out.println("Deposit Successful");
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > balance){
            System.out.println("You have attempted an invalid amount");
        }
        else{
            balance = balance - withdrawAmount;
            System.out.println("Successful Withdraw");
        }
    }


    public void printStatement(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: "+ holderName);
        System.out.println("Current balanace: R" + balance);
    }
}
