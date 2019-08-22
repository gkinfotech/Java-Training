import java.util.StringTokenizer;

class StringTokenizers {

    public String tokenizeString(String s){
        StringTokenizer sts = new StringTokenizer(s," ");
        while (sts.hasMoreTokens()){
            System.out.println(sts.nextToken());
        }
        return "";
    }
    public static void main(String[] args) {
        String s1 = "Welcome back to java Program Gokul!";
        StringTokenizers st = new StringTokenizers();
        st.tokenizeString(s1);

    }
}

/*
Output:
Welcome
back
to
java
Program
Gokul!


 */
