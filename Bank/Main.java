package Bank;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount saveacc = new SavingsAccount("123456789","vamsikrishna",10000, 6.250);
        CurrentAccount curracc = new CurrentAccount("987654321", "satyanarayana",50000,5000);
        bank.addAccount(curracc);
        bank.addAccount(saveacc);
        saveacc.checkBalance();
        curracc.checkBalance();
        saveacc.deposit(5000);
        curracc.withDraw(15000);
        saveacc.addIntrest();
        bank.transferFund("987654321", "123456789", 20000);
        saveacc.checkBalance();
        curracc.checkBalance();
    }
}