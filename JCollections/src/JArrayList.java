
import java.lang.reflect.Array;
import java.util.*;

public class JArrayList {
    void addList(){
        System.out.println("Add values to the List");

        ArrayList<String> fl = new ArrayList<>();

        fl.add("onion");
        fl.add("Potato");
        fl.add("Beetroot");
        fl.add("Brumstick");

        Iterator itr = fl.iterator();
        while (itr.hasNext()){//becomes true
            System.out.println(itr.next());
        }
    }
    public static void main(String[] args) {
        JArrayList obj = new JArrayList();
        obj.addList();
    }
}


/*
Java Collection:
Its a framework that provides a Architecture to store and manipulate group of objects

                        Collections

                List           Set                 Map
            1. ArrayList    1. HashSet          1. HashMap
            2. LinkedList   2. LinkedHashSet    2. TreeMap
            3. Vector       3. TreeSet          3. LinkedHashMap
            4. Stack        4. EnumSet          4. EnumMap
                            5. SortedSet

1. List=>ArrayList(TypeSafety)
=> contains duplicate Values
=> maintains Insertion Order
=> Non Synchronized
=> Ordered Collection

Syntax:
ArrayList<String> ss= new ArrayList<>();


Converting String Array to ArrayList:
String[] fruits = {"mango","Banana","Orange","Grapes","Kiwi","Fig","Watermelon"};
   List<String> fru = Arrays.asList(fruits);


   List of Methods in arrayList:
   add()
   remove()
   removeAll()
   removeIF()-> (eg: str.contains("mango");
   clear()
   set()
   get()


   2. LinkedList:
   => can contains duplicate values
   => maintains Insertion order
   => non synchronized
   => Mainpulation is very fast (eg: large data set)

   Synchronized vs non synchronized

   Synchronized=> Thread safe

   deadlocks => 4 resources => task 2 => remain=>2 3 resouces i have only 2

   Synchronized:- Thread safe = and can be shared with many threads
   if we are executing something then we need to wait for it to finish before moving to other another task

   non Synchronized => two threads run at parallely
   Collection object is mutable that menas once creating the obj and that obj is calling two threads at the same time but one thread is changing the value of the obj then it can be affected by another obj .. so it not thread safe

   II=> Hashset
   => Hashset contains unique elements only
   =>Hash set allows null values
   =>Non -Synchronized
   =>It doesnt insertion order
   => best approach: search oerations

   LinkedHashSet:
 => Hashset contains unique elements only
   =>Hash set allows null values
   =>Non -Synchronized
   =>It maintain insertion order




 */