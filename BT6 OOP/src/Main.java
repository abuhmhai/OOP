//Main
public class Main {
    public static void main(String[] args){
        BankAccount bankAccount=new BankAccount("Bew Coder",7896436,289.2);
        System.out.println("Account Information");
        System.out.println("accountHolder: "+bankAccount.getAccountHolder());
        System.out.println("accountNumber: "+bankAccount.getAccountNumber());
        System.out.println("balance: "+bankAccount.getBalance());

        bankAccount.deposit(900.0);
        bankAccount.withdraw(123.0);
    }
}
