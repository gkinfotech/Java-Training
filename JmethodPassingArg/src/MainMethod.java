

public class MainMethod {
    public int add(int a ,int b){
       return a+b;
    }

    public int sub(int a , int b){
        return a-b;
    }
    public static void main(String[] args) {

        MainMethod obj = new MainMethod();

        System.out.println("Sum="+obj.add(10,5));
        System.out.println("Sub="+obj.sub(10,5));
    }

}
