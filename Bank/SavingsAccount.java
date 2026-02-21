package Bank;
public class SavingsAccount extends Account{
    private double intrestrate;
    SavingsAccount(String accountnumber,String accountname,double balance,double intrestrate){
        super(accountnumber, accountname, balance);
        this.intrestrate = intrestrate;
    }
    void addIntrest(){
        double intrest = ((intrestrate*balance)/100);
        deposit(intrest);
        System.out.println(getAccountName()+" your total balance after intrest added: "+balance);
    }
}
