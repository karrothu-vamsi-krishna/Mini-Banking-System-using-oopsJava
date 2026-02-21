package Bank;
import java.util.ArrayList;
public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    public void addAccount(Account account){
        accounts.add(account);
    }
   public Account findAccount(String accountnumber){
        for(Account acc:accounts){
            if(acc.getAccount().equals(accountnumber)){
                return acc;
            }
        }
        System.out.println("account not found");
        return null;
    }
    void transferFund(String fromaccountnumber,String toaccountnumber,double amount){
        Account fromaccount = findAccount(fromaccountnumber);
        Account toaccount = findAccount(toaccountnumber);
        if(fromaccount != null && toaccount != null){
        fromaccount.withDraw(amount);
        toaccount.deposit(amount);
        System.out.println("funds transfered from "+fromaccount.getAccountName()+" to "+toaccount.getAccountName());
    }

    }

}
