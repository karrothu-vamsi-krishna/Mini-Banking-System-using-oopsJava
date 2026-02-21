package Bank;
public abstract class Account{
    private String accountnumber;
    private String accountname;
    protected double balance;

    Account(String accountnumber,String accountname,double balance){
        this.accountnumber = accountnumber;
        this.accountname = accountname;
        this.balance = balance;
    }
    void deposit(double amount){
        balance = balance+amount;
        System.out.println(this.accountname+" you have deposited amount : "+amount);
        System.out.println(this.accountname+" your total balance now : "+balance);
    }
    void withDraw(double amount){
        if(balance>=amount){
        balance = balance-amount;
        System.out.println(this.accountname+" you have deposited amount : "+amount);
        System.out.println(this.accountname+" your total balance now : "+balance);
        }
        else{
            System.out.println(this.accountname+" not enough balance to withdraw");
            System.out.println(this.accountname+" your total balance now : "+balance);
        }
    }
    void checkBalance(){
        System.out.println(this.accountname+" balance: "+balance);
    }
    public String getAccount(){
        return accountnumber;
    }
    public String getAccountName(){
        return accountname;
    }
}
