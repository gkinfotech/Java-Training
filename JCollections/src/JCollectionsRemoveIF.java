import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JCollectionsRemoveIF {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>(Arrays.asList("Srini","Debasish","Amit","Sid","Gokul"));

        System.out.println("Initial Array List"+al);

        al.removeIf(n ->(n.contains("Gokul")));

        System.out.println("updated Array List:"+al);

        //n.charAt(0) == 'S'
    }
}
/*
Number which is divisble by 3
Numbers.removeIf(n -> (n % 3 == 0));

        for (int i : Numbers) {
            System.out.println(i);
        }
 */