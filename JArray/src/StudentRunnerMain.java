import java.math.BigDecimal;

public class StudentRunnerMain {
    public static void main(String[] args) {
        int [] marks={99,98,100};
        Student student = new Student("Gokul",marks);
        int number = student.numberOfMarks();
        System.out.println("Number of Marks:"+number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Student Total Marks:"+sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Student Max mark is:"+maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Student Min mark is:"+minimumMark);

        BigDecimal average = student.getAverageOfMarks();
        System.out.println("Average Mark:"+average);
        //student.
    }
}
