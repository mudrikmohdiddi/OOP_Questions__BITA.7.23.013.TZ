public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 =new SavingsAccount(2000.00 );
        SavingsAccount saver2 =new SavingsAccount(3000.00 );
        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("When annual interest is 4%");
        System.out.printf("New balances for saver1:%,.2f\n",saver1.getBalance());
        System.out.printf("New balances for saver2:%,.2f\n",saver2.getBalance());
        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("When annual interest is 5%");
        System.out.printf("New balances for saver1:%,.2f\n",saver1.getBalance());
        System.out.printf("New balances for saver2:%,.2f\n",saver2.getBalance());
    }
}
