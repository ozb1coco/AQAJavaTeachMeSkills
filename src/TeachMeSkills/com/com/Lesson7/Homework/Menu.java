package TeachMeSkills.com.com.Lesson7.Homework;

import java.util.Scanner;

public class Menu {
    public void menu() {
        System.out.println("Welcome to calculate program if choose ur action: \n 1) Calculate number \n 2) Exit the program");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        if (choose == 1) {
            for (; ; ) {
                System.out.println("Enter operation to calculate: \n 1) Summ \n 2) Division \n 3) Multiply \n 4) Substraction \n 5) Exit");
                int calculateOperation = scanner.nextInt();
                if (calculateOperation > 0 && calculateOperation < 6) {
                    if (calculateOperation == 5) {
                        break;
                    } else {
                        System.out.println("Enter two numbers: ");
                        double number1 = 0, number2 = 0;
                        if (scanner.hasNextDouble()) {
                            number1 = scanner.nextDouble();
                        }
                        if (scanner.hasNextDouble()) {
                            number2 = scanner.nextDouble();
                        }
                        switch (calculateOperation) {
                            case 1:
                                Calculatble summ = new Summ(number1, number2);
                                summ.action();
                                break;
                            case 2:
                                Calculatble subtraction = new Subtraction(number1, number2);
                                subtraction.action();
                                break;
                            case 3:
                                Calculatble multiply = new Multiply(number1, number2);
                                multiply.action();
                                break;
                            case 4:
                                Calculatble division = new Division(number1, number2);
                                division.action();
                                break;
                            case 5:
                                return;
                        }
                    }
                }
            }
        }
        else if (choose == 2) {
            System.out.println("U exit from calculator good bye");
        } else {
            System.out.println("U entered wrong value");
        }
    }
}

