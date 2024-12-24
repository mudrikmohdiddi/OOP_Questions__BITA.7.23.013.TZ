public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(5000);
        account1.Credit(4000);
        account1.Debit(15000);
        System.out.println("The balance is "+account1.getBalance());
        Account account2 = new Account(-3000);
        account2.Credit(13000);
        account2.Debit(10000);
        System.out.println("The balance "+account2.getBalance());

    }
}
