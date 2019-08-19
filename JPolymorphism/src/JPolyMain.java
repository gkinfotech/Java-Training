public class JPolyMain {
    // Method overloading
    public void add(){
        System.out.println("output:"+2);
    }
    public void add(int a){
        System.out.println("output:"+ (a+a));
    }
    public void add(String a){
        System.out.println("output:"+ a);
    }
    public void add(int a, int b){
        System.out.println("output:"+(a+b));
    }
    public void add(int a, int b, int c){
        System.out.println("output:"+(a+b+c));
    }

    public static void main(String args[]){
        JPolyMain obj = new JPolyMain();
        obj.add();
        obj.add(10);
        obj.add("java");
        obj.add(10,20);
        obj.add(10,20,30);

    }
}

/*
PolyMorphism

poly=>many
Morphism=> Behaviour

Ability of an object to take more than one forms or behaviour

2- types of polymorphism
1. Compile Time Polymorphism/ Static binding/ Early Binding
Eg: Overloading

3 types of overloading
* Method Overloading**
    Same method name with different arguments that is called as method overloading
* Constructor Overloading**
* Operator Overloading**

2. Run time Polymorphism/dynamic binding/late binding
eg: Overriding

 */
