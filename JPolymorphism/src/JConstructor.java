public class JConstructor {
    JConstructor(){
        System.out.println("output:"+2);
    }
   JConstructor(int a){
        System.out.println("output:"+ (a+a));
    }

    JConstructor(int a, int b){
        System.out.println("output:"+(a+b));
    }
    JConstructor(int a, int b, int c){
        System.out.println("output:"+(a+b+c));
    }
    public static void main(String args[]){
        //Constructor Overloading
        /*
        Same Class name with different parameters=> Constructor Overloading

         */
        JConstructor obj =new JConstructor();
        JConstructor obj1 =new JConstructor(10);
        JConstructor obj2 =new JConstructor(10,20);
        JConstructor obj3 =new JConstructor(10,20,30);
    }
}

/*
1. Constructor doesnt have Return Type
2. Constructor name should same as class name
3. Constructor cannot be inherited
 */
