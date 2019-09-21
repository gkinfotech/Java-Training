public class InterfaceDemo {
    public static void main(String[] args) {
        BankInterface hdfc = new HDFC();
        hdfc.deposit();
        hdfc.withdrawal();
        hdfc.calculateInterest();

        BankInterface icici = new ICICI();
        icici.deposit();
        icici.withdrawal();
        icici.calculateInterest();



    }
}
