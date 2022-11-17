package TeachMeSkills.com.Lesson7.Homework;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    MathOperationResultHistoryCollections mathOperationResultHistoryCollections = new MathOperationResultHistoryCollections();


    public void print() {
        try {
            menu();
        } catch (MenuWrongChoiceException | MathOperationChoiceException | DivideByZeroExceptionCalc e) {
            System.out.println(e.getMessage());
        }
    }

    private void mathOperation(String calculateOperation) throws ArithmeticException, DivideByZeroExceptionCalc {
        double number1 = 0;
        double number2 = 0;
        double result = 0d;

        System.out.println("Enter 2 nums: ");
        switch (calculateOperation) {
            case "+" -> {
                if (scanner.hasNextDouble()) {
                    number1 = scanner.nextDouble();
                }
                if (scanner.hasNextDouble()) {
                    number2 = scanner.nextDouble();
                }
                Calculatble summ = new Summ();
                result = summ.action(number1, number2);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, number1);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, number2);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, result);
                System.out.println(result);
            }
            case "-" -> {
                if (scanner.hasNextDouble()) {
                    number1 = scanner.nextDouble();
                }
                if (scanner.hasNextDouble()) {
                    number2 = scanner.nextDouble();
                }
                Calculatble subtraction = new Subtraction();
                result = subtraction.action(number1, number2);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, number1);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, number2);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, result);
                System.out.println(result);
            }
            case "*" -> {
                if (scanner.hasNextDouble()) {
                    number1 = scanner.nextDouble();
                }
                if (scanner.hasNextDouble()) {
                    number2 = scanner.nextDouble();
                }
                Calculatble multiply = new Multiply();
                result = multiply.action(number1, number2);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, number1);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, number2);
                mathOperationResultHistoryCollections.addToHistory(calculateOperation, result);
                System.out.println(result);
            }
            case "/" -> {
                if (scanner.hasNextDouble()) {
                    number1 = scanner.nextDouble();
                }
                if (scanner.hasNextDouble()) {
                    number2 = scanner.nextDouble();
                }
                Calculatble division = new Division();
                if (number2 == 0) {
                    throw new DivideByZeroExceptionCalc();
                } else {
                    result = division.action(number1, number2);
                    mathOperationResultHistoryCollections.addToHistory(calculateOperation, number1);
                    mathOperationResultHistoryCollections.addToHistory(calculateOperation, number2);
                    mathOperationResultHistoryCollections.addToHistory(calculateOperation, result);
                    System.out.println(result);
                }
            }
            case "History" -> mathOperationResultHistoryCollections.printMathOperationHistory();
        }
    }

    private void menu() throws MenuWrongChoiceException, MathOperationChoiceException, DivideByZeroExceptionCalc {
        mathOperationResultHistoryCollections.createHistoryCollection();
        System.out.println("Welcome to calculate program if choose ur action: \n 1) Calculate number \n 2) Exit the program");
        int choose = scanner.nextInt();
        if (choose < 1 || choose > 3) {
            throw new MenuWrongChoiceException();
        }
        if (choose == 1) {
            for (; ; ) {
                System.out.println("""
                        Enter operation to calculate:\s
                         1) Summ (+)\s
                         2) Substraction (-)\s
                         3) Multiply (*)\s
                         4) Division (/) \s
                         5) Show math History(History)
                         6) Exit (Exit)""");
                System.out.println();
                System.out.println("==========================================");
                String calculateOperation = scanner.next();
                if (calculateOperation.equals("+") || calculateOperation.equals("-") || calculateOperation.equals("*") ||
                        calculateOperation.equals("/") || calculateOperation.equals("History")) {
                    mathOperation(calculateOperation);
                } else if (calculateOperation.equals("Exit")) {
                    System.out.println("U exit from program good bye");
                    break;
                } else {
                    System.out.println("U entered wrong value");
                }
            }
        } else if (choose == 2) {
            System.out.println("U exit from calculator good bye");
        } else {
            System.out.println("U entered wrong value");
        }
    }
}

