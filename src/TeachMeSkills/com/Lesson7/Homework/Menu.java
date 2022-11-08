package TeachMeSkills.com.Lesson7.Homework;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void print() {
        try {
            menu();
        }
        catch (MenuWrongChoiceException | MathOperationChoiceException e){
            System.out.println(e.getMessage());
        }
    }
    private void mathOperation(int calculateOperation) throws ArithmeticException {
        double number1 = 0;
        double number2 = 0;
        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
        }
        if (scanner.hasNextDouble()) {
            number2 = scanner.nextDouble();
        }
        switch (calculateOperation){
            case 1:
                Calculatble summ = new Summ();
                summ.action(number1, number2);
                break;
            case 2:
                Calculatble subtraction = new Subtraction();
                subtraction.action(number1, number2);
                break;
            case 3:
                Calculatble multiply = new Multiply();
                multiply.action(number1, number2);
                break;
            case 4:
                Calculatble division = new Division();
                if (number2 == 0) {
                    throw new ArithmeticException();
                } else {
                    division.action(number1, number2);
                }
                break;
        }
    }
    private void menu() throws MenuWrongChoiceException, MathOperationChoiceException{
        System.out.println("Welcome to calculate program if choose ur action: \n 1) Calculate number \n 2) Exit the program");
        int choose = scanner.nextInt();
        if(choose < 1 || choose > 2){
            throw new MenuWrongChoiceException();
        }
        if (choose == 1) {
            for (; ; ) {
                System.out.println("Enter operation to calculate: \n 1) Summ \n 2) Substraction \n 3) Multiply \n 4) Division  \n 5) Exit");
                int calculateOperation = scanner.nextInt();
                if(calculateOperation < 1 || calculateOperation >= 6){
                    throw new MathOperationChoiceException();
                }
                if (calculateOperation == 5) {
                    System.out.println("U exit from program good bye");
                    break;
                } else {
                    System.out.println("Enter two numbers: ");
                    try {
                        mathOperation(calculateOperation);
                    }catch (ArithmeticException e){
                        System.out.println("Divide by ZERO Exception");
                    }
                }
            }
        } else {
            System.out.println("U exit from calculator good bye");
        }
    }
}

