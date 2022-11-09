package TeachMeSkills.com.Lesson7.Homework;

public class MenuWrongChoiceException extends Exception{
    public MenuWrongChoiceException() {
        super("U must enter number 1 or 2!, try again: ");
    }
}


