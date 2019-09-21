public class EncapsulationMain {
    public static void main(String[] args) {
        EmployeeData obj = new EmployeeData();
        obj.setEmpName("Gokul");
        obj.setSsn(1111888999);
        obj.setEmpAge(29);

        System.out.println("Employee Name is:"+obj.getEmpName());
        System.out.println("Employee ID is:"+obj.getSsn());
        System.out.println("Employee age is:"+obj.getEmpAge());

    }
}
/*
Encapsulation -Wrapping upon data and function into single units
=> Data Hiding
=> Hid your data members (var&Mem)
=>Biniding your fields and methods together and capsulate bindings
=>Security point of view encapsulation will be used
=>no one from outside the calss can access the private data members

 */
