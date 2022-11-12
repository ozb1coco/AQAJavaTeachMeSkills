package TeachMeSkills.com.Lesson10.Homework;

import java.util.List;

public class MarksOperations {
    private List<Integer> marks;

    public MarksOperations(List<Integer> marks) {
        this.marks = marks;
    }

    public double averageMarks(List<Integer> allMarks) {
        int count = 0;
        double marksSumm = 0;
        double averageMark;
        for (Integer mark : marks) {
            marksSumm = marksSumm + mark;
            count++;
        }
        averageMark = marksSumm / count;
        return averageMark;
    }
}

