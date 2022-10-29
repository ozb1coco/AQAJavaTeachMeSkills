package TeachMeSkills.com.com.Lesson5.ClassWork;

public class Calculater {
    int number1;
    int number2;

    public Calculater(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int Summ(int number1, int number2)
    {
        return number1 + number2;
    }
    public int Subtraction(int number1, int number2)
    {
        return  number1 - number2;
    }
    public double Multiply(int number1, int number2)
    {
        return number1 * number2;
    }
    public double Division(int number1, double number2)
    {
        return number1 / number2;
    }
}
