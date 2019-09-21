import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JStringArraytoArrayList {
    public static void main(String[] args) {
        String[] fruits = {"mango","Banana","Orange","Grapes","Kiwi","Fig","Watermelon"};
        //Converting String Array to ArrayList


        List<String> fruit = Arrays.asList(fruits);
        //get()
        System.out.println("i am fetching the 2=>element in the arraylist:"+fruit.get(2));
        //set()
        System.out.println("I am setting the values in the 1st position:"+fruit.set(1,"Pomogranet"));



        Iterator itr = fruit.iterator();
        while (itr.hasNext()){//becomes true

            System.out.println(itr.next());
        }
    }
}
