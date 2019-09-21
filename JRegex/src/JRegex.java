public class JRegex {
    public static void main(String[] args) {
        String a="Gokul123 4$$$ ";

       // String s2=s1.replaceAll("[a-zA-Z\\s]", "");
        String b= a.replaceAll("[^0-9a-zA-Z//s]","");
        System.out.println(b);

    }
}
