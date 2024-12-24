public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public void calculateMonthlyInterest(){
        savingsBalance = savingsBalance * annualInterestRate / 12 + savingsBalance;
    }
    public static void modifyInterestRate(double InterestModify){
        annualInterestRate = InterestModify;
    }
    public double  getBalance(){
        return savingsBalance;
    }

}
