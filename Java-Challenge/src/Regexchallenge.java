import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Regexchallenge {
    public static void main(String[] args) {
        String s ="/beauty-&-vitalität/bareminerals®/_/N-lfv5Z1z13kvhZ1z13rtgZ1z13rtdZ1z13rsxZ1z13rtt/c.html";
        StringBuilder sb = new StringBuilder();
        String out = s.replaceAll("[^a-zA-Z0-9\\s-&/_.]", "");

        StringTokenizer st = new StringTokenizer(s,"");
        while (st.hasMoreTokens()){
            String s2 = st.nextToken();
            if (!s2.contains(out)){
                try {
                    sb.append(URLEncoder.encode(s, StandardCharsets.UTF_8.toString()));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Inout:"+s);
        System.out.println("Output:"+out);
        System.out.println("Tokenize:"+sb.toString());
    }
}
