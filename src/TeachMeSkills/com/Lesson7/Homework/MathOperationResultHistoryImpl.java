package TeachMeSkills.com.Lesson7.Homework;

import java.util.Arrays;

public class MathOperationResultHistoryImpl implements MathOperationHistory {
    private double[] history = new double[5];
    private int index = 0;

    @Override
    public void addToHistory(double value) {
        if (index == history.length) {
            index = 0;
        }
        history[index] = value;
        index++;
    }

    @Override
    public void addToHistory(String operation, double value) {
    }

    @Override
    public void printMathOperationHistory() {
        System.out.println(Arrays.toString(history));
    }
}
