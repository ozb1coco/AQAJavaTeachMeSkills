package TeachMeSkills.com.Lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.1
        System.out.println("Lesson 1.1");
        int a = 50;
        if (a > 0) {
            if (a > 0 && a < 10) {
                System.out.println("Number is positive and one grade");
            }
            if (a > 9 && a < 100) {
                System.out.println("Number is positive and two grade");
            }
            if (a > 99 && a < 1000) {
                System.out.println("NUmber is positive and three grade");
            }
        } else if (a < 0) {
            if (a < 0 && a > -10) {
                System.out.println("Number is negative and one grade");
            }
            if (a < -9 && a > -100) {
                System.out.println("Number is negative and two grade");
            }
            if (a < -99 && a > -1000) {
                System.out.println("Number is negative and three grade");
            }
        } else {
            System.out.println("number is null");
        }
        //Lesson 1.2
        System.out.println("Lesson 1.2");
        int side1 = 5, side2 = 7, side3 = 10;
        if (side1 + side2 > side3
                && side1 + side3 > side2 &&
                side2 + side3 > side1) {
            System.out.println("Triangle exist");
        } else {
            System.out.println("Triangle didnt exist");
        }
        //Lesson 1.3
        System.out.println("Lesson 1.3");
        int number = 10;
        if (number % 2 == 0) {
            number++;
        }
        if (number % 2 != 0) {
            number -= 2;
        }
        System.out.println("Number is: " + number);
        //Lesson 1.4
        System.out.println("Lesson 1.4");
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
            if (number > 0) {
                count++;
            }
        }
        System.out.println("Positive numbers is: " + count);
        //Lesson 1.5
        System.out.println("Lesson 1.5");
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
            if (number > 0) {
                countPositive++;
            }
            if (number < 0) {
                countNegative++;
            }
        }
        System.out.println("Positive numbers is: " + countPositive +
                " Negative numbers is: " + countNegative);
        //1.6
        System.out.println("Lesson 1.6");
        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println("number one is bigger: " + number1);
        } else if (number2 > number1) {
            System.out.println("number two is bigger: " + number2);
        } else {
            System.out.println("Numbers are equals");
        }
        //1.7
        System.out.println("Lesson 1.7");

        int programmist = scanner.nextInt();
        if (programmist % 100 >= 11 && programmist % 100 <= 20 || programmist == 111 || programmist >= 5 && programmist <= 20 || programmist == 0
                || programmist % 10 >= 5 && programmist % 10 <= 9) {
            System.out.println(programmist + " programistov");
        } else if (programmist == 1 || programmist % 10 == 1 || programmist % 100 == 1) {
            System.out.println(programmist + " programist");
        }
        else if ((programmist >= 2 && programmist <= 4) || (programmist % 10 >= 2 && programmist % 10 <= 4)) {
            System.out.println(programmist + " programista");
        }
        //2.1
        System.out.println("Lesson 2.1");
        double runTrip = 10;
        double fullTrip = runTrip;
        for (int i = 1; i < 7; i++) {
            runTrip = runTrip + runTrip * 0.1;
            fullTrip = runTrip + fullTrip;
        }
        System.out.println("All trip is: " + fullTrip);
        //2.2
        System.out.println("Lesson 2.2");
        int amoeba = 1;
        int hours = 0;
        for(int i = 0; i < 8; i++ )
        {
            amoeba = amoeba + amoeba * 2;
            hours = hours + 3;
            System.out.println("Amoeba value after " + hours + " hours is : " + amoeba);
        }
        //2.3
        System.out.println("Lesson 2.3");
        number = 1;
        for(int i = 1; i <= 256;i = i * 2) {
            System.out.println(number = number + i);
        }
        int summ = 0;
        while(number <= 256)
        {
            summ = summ + number;
            number*=2;
            System.out.println(summ);
        }
        //2.4
        System.out.println("Lesson 2.4");
        System.out.println("Enter multiply numbers: ");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int multiply = 0;
        for(int i = 0; i < numberA; i++)
        {
            multiply = multiply + numberB;
        }
        System.out.println(multiply);
        //2.5
        System.out.println("Lesson 2.5");
        final double converter = 2.54;
        double distanceInCm;
        for(int i = 1; i <= 20; i++)
        {
            distanceInCm = converter * i;
            System.out.println(i + " inch its " + distanceInCm + " cm. ");
        }
        //2.6
        System.out.println("Lesson 2.6");
        for(int i = 2; i <=100; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
        //2.7
        System.out.println("Lesson 2.7");
        for(int i = 1; i <= 99; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
        //2.8.1
        System.out.println("Lesson 2.8.1");
        char star = '*';
        for(int i = 1; i < 4; i++)
        {
            for(int j = 0; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
        //2.8.2
        int space = 1;
        System.out.println("Lesson 2.8.2");
        for(int i = 4; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(star);
            }
            System.out.println();
            for (int k = 0; k < space; k++)
            {
                System.out.print(" ");
            }
            space++;
        }
        //2.9
        System.out.println("Lesson 2.9");
        number1 = 1;
        number2 = 1;
        int number3;
        System.out.print(number1 + " + " + number2);
        for(int i = 0; i < 20; i++)
        {
            number3 = number1 + number2;
            System.out.print(" + " + number3);
            number1 = number2;
            number2 = number3;
        }
        //2.10
        System.out.println("Lesson 2.10");
        int naturalNumber;
        System.out.println("Enter natural number: ");
        if(scanner.hasNextInt()) {
            naturalNumber = scanner.nextInt();
            System.out.print("Even numbers is: ");
            for (int i = naturalNumber; i > 0; i--) {
                int evenCheck = naturalNumber%i;
                if(evenCheck == 0)
                {
                    System.out.print(i + " ");
                }
            }
        }
        else {
            System.out.println("Wrong value");
        }
        //2.11
        System.out.println("Lesson 2.11");
        int simpleNumber;
        int counter = 0;
        System.out.println("Enter simple number: ");
        if(scanner.hasNextInt())
        {
            simpleNumber = scanner.nextInt();
            for(int i = simpleNumber; i > 0; i--)
            {
                int evenCheck = simpleNumber%i;
                if(evenCheck == 0)
                {
                    counter++;
                }
            }
            if(counter > 2)
            {
                System.out.println("This number isn't simple");
            }
            else {
                System.out.println("This number is simple");
            }
        }
        else {
            System.out.println("wrong value");
        }
        //2.12
        System.out.println("Lesson 2.12");
        System.out.println("Enter value: ");
        int userValue = scanner.nextInt();
        summ = 0;
        for(int i = userValue; i > 0; i--)
        {
            summ = summ + i;
        }
        System.out.println(summ);
    }
}
