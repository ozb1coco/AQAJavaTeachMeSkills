package TeachMeSkills.com.Lesson7.Homework;

public class Subtraction implements Calculatble{
    private double number1, number2;

    public Subtraction(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public double getNumber1() {
        return number1;
    }
    public double getNumber2() {
        return number2;
    }
    @Override
    public void action() {
        System.out.println(getNumber1() - getNumber2());
    }
}
