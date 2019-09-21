public class AbstractClassDemo {
    public static void main(String[] args) {
      Bank hdfc = new HDFC();
       hdfc.withdraw();
       hdfc.deposit();
       hdfc.calculateInterest();

       Bank icici = new ICICI();
       icici.withdraw();
       icici.deposit();
       icici.calculateInterest();

    }
}
