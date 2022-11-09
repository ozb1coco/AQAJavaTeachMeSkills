package TeachMeSkills.com.Lesson7.Homework;

public class MathOperationChoiceException extends Exception{
    public MathOperationChoiceException() {
        super("U must enter numbers from 1 to 5, try again: ");
    }
}
