interface sayable{
    public String say();
}

//Java Lambda Expression Example: No Parameter
public class JLambdaNoParameter {
    public static void main(String[] args) {
        sayable ss = ()->{
            return "I have nothing";
        };
        System.out.println(ss.say());
    }
}
