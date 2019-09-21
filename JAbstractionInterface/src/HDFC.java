public class HDFC implements BankInterface {
    @Override
    public void deposit() {
        System.out.println("HDFC Bank Deposit");
    }

    @Override
    public void withdrawal() {

        System.out.println("HDFC Bank Withdrawal");
    }

    @Override
    public void calculateInterest() {
        System.out.println("HDFC Bank Interest!");

    }
}
