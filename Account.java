public class Account {
    private int accountBalance;
    public Account(int accountBalance){
        if(accountBalance >= 0){
            this.accountBalance = accountBalance;
        }
        else{
            this.accountBalance = 0;
            System.out.println("Initial balance was invalid");
        }
    }
    public void Credit(int Add){
        accountBalance = Add + accountBalance;
    }
    public void Debit(int withdraw){
        if(withdraw > accountBalance){
            System.out.println("Debit amount exceeded account balance");
        }
        else{
            accountBalance = accountBalance - withdraw;
        }
    }
    public int getBalance(){
        return accountBalance;
    }
}
