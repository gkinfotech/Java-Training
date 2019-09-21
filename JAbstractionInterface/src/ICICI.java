public class ICICI implements BankInterface {
    @Override
    public void deposit() {
        System.out.println("ICICI Bank Deposit");
    }

    @Override
    public void withdrawal() {

        System.out.println("ICICI Bank Withdrawal");
    }

    @Override
    public void calculateInterest() {
        System.out.println("ICICI Bank Interest!");

    }
}
