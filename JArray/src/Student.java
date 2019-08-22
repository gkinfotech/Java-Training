import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    String name;
    int marks[];

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public int numberOfMarks(){
        return marks.length;
    }

    public int getTotalSumOfMarks(){
        int sum=0;
        for (int mark:marks){
            sum+=mark;
        }
        return sum;
    }

    public BigDecimal getAverageOfMarks() {
        int sum = getTotalSumOfMarks();
        BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(marks.length), 3, RoundingMode.UP);
        return average;
    }

    public int getMaximumMark(){
        int max = Integer.MIN_VALUE;
        for (int mark:marks){
            if (mark>max){
                max = mark;
            }
        }
        return max;

    }

    public int getMinimumMark(){
        int min = Integer.MAX_VALUE;
        for (int mark:marks){
            if (mark<min) {
                min = mark;
            }
        }
        return min;
    }
}
