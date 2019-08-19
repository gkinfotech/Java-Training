public class Boy extends Human {
    public void eat(){
        //super.eat();
        System.out.println("Boy is Eating");
    }

    public static void main(String args[]){
        Boy obj = new Boy();
        obj.eat();
    }
}


/*
Method Overriding: Child class has the same method as declared in parent class

Rules:
1. Method name must have same name as in parent class
2. the Method must have the same parameter which you have declared same as parent method parameters
3. It is used in inheritance


Human (eat)=> Boy (eat) class is extending parent class(Human)



 */