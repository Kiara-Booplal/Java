package ClassAndObjectsBasics.BankAccountLite;

public class BankAccountDemo {
    public static void main (String [] args){

        BankAccountLite bal = new BankAccountLite("12345", "Alice Smith", 2345);
        bal.deposit(100);
        bal.printStatement();
        bal.withdraw(50);
        bal.printStatement();
    }
}
