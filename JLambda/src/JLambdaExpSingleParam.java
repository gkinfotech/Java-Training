interface Sayable{
    public String say(String name);
}

public class JLambdaExpSingleParam {
    public static void main(String[] args) {

        Sayable s1=(name)->{
            return name;
        };
        System.out.println(s1.say("Gokul"));

    }
}
