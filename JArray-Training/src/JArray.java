import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class JArray {
    public static void main(String[] args) {

        //Arrays.fill();
        int a[]=new int[5];
        Arrays.fill(a,5);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //syntax of declaring array
       /* int a[] = new int[10];
        int b[]={10,20,30,40};
        for (int i=0;i<b.length;i++){
            System.out.println("The Values are:"+b[i]);
        }

        //Getting the values from user
        int s;
        Scanner ss = new Scanner(System.in);
        System.out.println("How values you need to store the values in to the array?");
        s=ss.nextInt();
        int c[] = new int[s];
        for (int i=0;i<s;i++){
            c[i]=ss.nextInt();
            System.out.println("Getting values from user:"+c[i]);
        }

        //Printing the values which are stored in the c[] array
        for (int i=0;i<c.length;i++){
            System.out.println("The Values are:"+c[i]);
        }*/


    }
}
/*

Array size once you have initialized that cannot be changes
Size can be created during runtime as well

advantage:
Allows to effectively store and use large no of values same type
Better than creating variables of same type(a =10, b=20,c=30)..
int a[]= {10,20,30};


Disadvantage:
1.We must know the size in advance
2.cannot grow dynamically after created
3.Memory space is wasted if we allocate more memory and utlizing very less

 */