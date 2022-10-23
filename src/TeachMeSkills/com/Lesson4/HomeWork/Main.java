package TeachMeSkills.com.Lesson4.HomeWork;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 3;
        int colls = 3;
        int summ = 0;
        int[][] doubleArray = new int[rows][colls];
        Random random = new Random();
        System.out.println("Task 1.1");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < colls; j++)
            {
                doubleArray[i][j] = random.nextInt(50);
            }
        }
        System.out.println();
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < colls; j++)
            {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < rows; i++)
        {
            if(doubleArray[i][i] % 2 == 0)
            {
                summ += doubleArray[i][i];
            }
        }
        System.out.println("summ of even elements is: " + summ);
        System.out.println("Task 1.2");
        summ = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < colls; j ++)
            {
                if(i > j || i == j)
                {
                    if(doubleArray[i][j] % 2 != 0) {
                        summ += doubleArray[i][j];
                    }
                }
            }
        }
        System.out.println("Summ = " + summ);
        System.out.println("Task 1.3");
        int arrayLenght = doubleArray.length - 1;
        int multiplyMainLine = 1;
        int multiplySecondaryLine = 1;
        for(int i = 0; i < rows; i++)
        {
            multiplyMainLine = multiplyMainLine * doubleArray[i][i];
        }
        for(int i = arrayLenght; i >= 0; i--)
        {
            multiplySecondaryLine = multiplySecondaryLine * doubleArray[i][arrayLenght - i];
        }
        if(multiplyMainLine > multiplySecondaryLine)
        {
            System.out.println("Main line bigger");
        }
        else if(multiplyMainLine < multiplySecondaryLine){
            System.out.println("Secondary line bigger");
        }
        else {
            System.out.println("Lines are same.");
        }
        System.out.println(multiplyMainLine);
        System.out.println(multiplySecondaryLine);
        System.out.println("Task 1.4");
        summ = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < colls; j++)
            {
                if(i < j)
                {
                    summ += doubleArray[i][j];
                }
            }
        }
        System.out.println("Summ is: " + summ);
        System.out.println("Task 1.5");
        int[][] secondaryDoubleArray = new int [rows][colls];
        for(int i = 0; i < rows; i++)
        {
            for (int j = 0; j < colls; j++)
            {
                secondaryDoubleArray[j][i] = doubleArray[i][j];
            }
        }
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < colls; j++)
            {
                System.out.print(secondaryDoubleArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
