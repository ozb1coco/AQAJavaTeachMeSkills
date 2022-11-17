package TeachMeSkills.com.Lesson7.Homework;

public interface MathOperationHistory {
    void addToHistory(double value);

    void addToHistory(String operation, double value);

    void printMathOperationHistory();
}
