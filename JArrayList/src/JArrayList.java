import java.util.Arrays;
import java.util.List;

public class JArrayList {
    public void creatingArrayList(){
        String fruits[] ={"Apple","Mango","Bannana"};

        List<String> words = Arrays.asList(fruits);
        System.out.println(words);
       // words.forEach((n)-> System.out.println(words));
    }
    public static void main(String[] args) {

        JArrayList obj = new JArrayList();
        obj.creatingArrayList();

    }
}
