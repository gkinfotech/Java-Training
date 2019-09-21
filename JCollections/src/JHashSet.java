import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class JHashSet {
    public static void main(String[] args) {
       Set<String> hs = new LinkedHashSet<>();
        hs.add("Python");
        hs.add("Java");
        hs.add("Java");
        hs.add("Kotlin");
        hs.add("Python");
        hs.add("Android");

        Iterator itr = hs.iterator();
        while (itr.hasNext()){//becomes true
            System.out.println(itr.next());
        }
    }
}
