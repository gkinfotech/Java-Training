public class MutableString {
    public static void main(String[] args) {
        String str = "Gokul";
        StringBuffer sb = new StringBuffer(str);
        sb.append("a Krishnan");
        System.out.println(sb.toString());
    }
}
/*
setCharAt()
StringBuffer=>Thread Safe
StringBuilder=>Performance
 */