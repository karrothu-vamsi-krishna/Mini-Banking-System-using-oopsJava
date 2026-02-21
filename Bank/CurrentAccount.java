package Bank;
public class CurrentAccount extends Account{
    private double overdraft;
    CurrentAccount(String accountnumber,String accountname,double balance,double overdraft){
        super(accountnumber,accountname,balance);
        this.overdraft = overdraft;
    }
    void withDraw(double amount){
        if(amount<=balance+overdraft){
            balance-=amount;
        System.out.println(getAccountName()+" you have withdrawn amount : "+amount);
        System.out.println(getAccountName()+" your total balance now : "+balance);
        }
        else{
            System.out.println(getAccountName()+" not enough balance including overdraft to withdraw");
            System.out.println(getAccountName()+" your balance now : "+balance);
            System.out.println(getAccountName()+" available overdraft"+overdraft);
        }
    }
}
