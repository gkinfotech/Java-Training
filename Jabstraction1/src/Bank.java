public abstract  class Bank {

    public void deposit(){
        System.out.println("Common Deposit method implements accross all banks");
    }

    public void withdraw(){
        System.out.println("Common Withdraw method implements accross all banks");
    }

    public abstract int calculateInterest();

}
