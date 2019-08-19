public class JOperatorOverloading {
    public static void main(String args[]){
        System.out.println(10+20);//30
        System.out.println("Hello"+"Java");// Hell0 Java (Concatenation)
        System.out.println("Hello"+"Java"+20); //Hell0 Java20
        System.out.println("Hello"+"Java"+20+30);//Hell0 Java2030
        System.out.println("Hello"+"Java"+(20+30)); //Hell0 Java50 //implicitly

    }
}
/*
Java doesnt support operator overloading
Cannot explicity overload operator
 */