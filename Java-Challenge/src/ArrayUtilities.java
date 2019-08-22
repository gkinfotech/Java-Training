import java.util.Arrays;

public class ArrayUtilities {
    public static void main(String[] args) {
        int[] marks = {50,60,90,99,65,76};
        for (int mark:marks){
            System.out.println(mark);
        }

        Arrays.sort(marks);
        System.out.println("Sorted Values");
        for (int mark:marks){
            System.out.println(mark);
        }

        int m1[] = new int[5];
        Arrays.fill(m1,100);
        for (int maths:m1){
            System.out.println("Arrays Filled values:"+maths);
        }
    }
}
/*
Arrays
1. Arrays.sort
2.Arrays.fill
3.Arrays.equals
 */