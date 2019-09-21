public class JString {
    public static void main(String[] args) {
        String a = "srini";
        String b = "siddharth";
        String c= "Java";


        StringBuffer sb1 = new StringBuffer();
        sb1.append("String Buffer:"+a+"\t"+b);
        System.out.println("Output:"+sb1.toString());


       /* StringBuilder sb= new StringBuilder();
        sb.append(a+"\t"+b);
        sb.append("\t"+c);
        String s = sb.toString();
        sb.append("Gokul");*/


    }
}


/*
String :
Mutable -> change
Immutable ->cannot be change

StringBuffer
It is not thread safe


String Builder
It is thread safe*/

