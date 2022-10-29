package TeachMeSkills.com.com.Lesson5.ClassWork;

import java.util.Scanner;

public class Main {
    //Создать класс калькулятор
    //в нем 2 переменные
    //Создать конструктор для инициализации этих полей
    //Создать 4 метода * / + -
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 and number 2");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Calculater calculater = new Calculater(number1,number2);
        System.out.println("summ " + calculater.Summ(number1, number2));
        System.out.println("div " + calculater.Division(number1,number2));
        System.out.println("mult " + calculater.Multiply(number1,number2));
        System.out.println("sub " + calculater.Subtraction(number1,number2));

    }
}
