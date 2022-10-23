package TeachMeSkills.com.com.Lesson3.HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.1
        System.out.println("Task 1.1");
        int[] array = new int[10];
        for (int i = 0, j = 2; i < array.length; i++, j += 2) {
            array[i] = j;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //1.2
        System.out.println("Task 1.2");
        array = new int[50];
        for (int i = 0, j = 1; i < array.length; i++, j += 2) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }
        for (int i = 0, j = 99; i < array.length; i++, j -= 2) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //1.3
        System.out.println("Task 1.3");
        Random random = new Random();
        array = new int[15];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Count of even numbers in array: " + count);
        //1.4
        System.out.println("Task 1.4");
        array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //1.5
        System.out.println("Task 1.5");
        array = new int[5];
        int[] array2 = new int[5];
        double averageArray1 = 0;
        double averageArray2 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            array2[i] = random.nextInt(15);
            averageArray1 = averageArray1 + array[i];
            averageArray2 = averageArray2 + array2[i];
        }
        averageArray1 = averageArray1 / 5;
        averageArray2 = averageArray2 / 5;
        if (averageArray1 > averageArray2) {
            System.out.println("average of array 1 bigger then average of array 2");
        } else if (averageArray1 < averageArray2) {
            System.out.println("average of array 2 bigger then average of array 1");
        } else {
            System.out.println("average value is same");
        }
        // 1.6
        System.out.println("task 1.6");
        array = new int[4];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                count++;
            }
        }
        if (count == 3) {
            System.out.println("Array is strogo vozrostayshiu");
        } else {
            System.out.println("Array is not strogo vozrostayshiu");
        }
        //1.7
        System.out.println("task 1.7");
        array = new int[12];
        int index = 0;
        int max = 0;
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = random.nextInt(15);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max value is: " + max +
                " and index of this element is : " + index);
        //1.8
        System.out.println("Task 1.8");
        array = new int[10];
        array2 = new int[10];
        double[] array3 = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(8) + 1;
            array2[i] = random.nextInt(8) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            array3[i] = (double)array[i] / array2[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < array3.length; i++)
        {
            if(array3[i] % 2 == 0)
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        //1.9
        System.out.println("task 1.9");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int summRight = 0;
        int summLeft = 0;
        if(scanner.hasNextInt()) {
            int size = scanner.nextInt();
            array = new int[size];
            if(size % 2 == 0) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(15);
                }
                int halfSize = size / 2;
                for (int i = halfSize; i > 0; i--) {
                    summLeft = summLeft + array[i];
                    System.out.println(summLeft);
                }
                for (int i = halfSize; i < array.length; i++) {
                    summRight = summRight + array[i];
                    System.out.println(summRight);
                }
                if (summLeft > summRight) {
                    System.out.println("Summ left is bigger");
                } else if (summLeft < summRight) {
                    System.out.println("Summ right is bigger");
                } else {
                    System.out.println("Summ are same");
                }
            }
            else {
                System.out.println("wrong value");
            }
        }
        //1.10
        System.out.println("Task 1.10");
        System.out.println("Enter N: ");
        int n = scanner.nextInt();
        array = new int[10];
        count = 0;
        if(n > 3)
        {
           for(int i = 0; i < array.length; i++){
               array[i] = random.nextInt(n);
               System.out.print(array[i] + " ");
               if(array[i] % 2 == 0)
               {
                   count++;
               }
           }
            array2 = new int[count];
            int indexArray2 = 0;
            for(int i = 0; i < array.length; i++)
            {
                if(array[i] % 2 == 0)
                {
                    array2[indexArray2] = array[i];
                    indexArray2++;
                }
            }
            System.out.println();
            for(int i = 0; i < array2.length; i++)
            {
                System.out.print(array2[i] + " ");
            }
        }
        else {
            System.out.println("Wrong value");
        }

        //1.10
        System.out.println("task 1.10");
        array = new int[5];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(6);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for(int j = 0; j < array.length; j++) {
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] > array[i - 1]) {
                    int swap = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = swap;
                }
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //2.1
        System.out.println("task 2.1");
        array = new int[5];
        int muptiplyArray = 1;
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(5) + 1;
            System.out.print(array[i] + " ");
            if(array[i] % 3 == 0)
            {
                muptiplyArray = muptiplyArray * array[i];
            }
        }
        System.out.println();
        if(muptiplyArray == 1)
        {
            System.out.println("nothing to multiply");
        }
        else {
            System.out.println("Multiply of indexis is: " + muptiplyArray);
            System.out.println();
        }
        //2.2
        System.out.println("task 2.2");
        array = new int[5];
        count = 1;
        double averageIndex = 0;
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10);
            if(i % 2 != 0)
            {
                count ++;
                averageIndex = averageIndex + array[i];
            }
        }
        averageIndex = averageIndex / count;
        System.out.println("Average value is: " + averageIndex);
        //2.3
        System.out.println("task 2.3");
        System.out.println("Enter value: ");
        int cNumber = scanner.nextInt();
        double averageArray = 0;
        count = 1;
        array = new int[5];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(15) + 1;
            if(array[i] > cNumber)
            {
                count++;
                averageArray = averageArray + array[i];
            }
        }
        averageArray = averageArray / count;
        System.out.println("average value is: " + averageArray);
        //2.4
        System.out.println("Task 2.4");
        int minValue = Integer.MAX_VALUE;
        array = new int[5];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(9) + 1;
            if(minValue > array[i] && array[i] % 2 != 0)
            {
                minValue = array[i];
            }
        }
        System.out.println("Min value is: " + minValue);
        //2.5
        System.out.println("task 2.5");
        array = new int[6];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(12) + 1;
            System.out.print(array[i] + " ");
            if(i % 2 != 0)
            {
                array[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i ++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //2.6
        System.out.println("Task 2.6");
        array = new int[6];
        count = 0;
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(9) + 1;
        }
        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(array[i] == array[j])
                {
                    count++;
                }
            }
        }
        if(count != 0)
        {
            System.out.println("arrays index have same values");
        }
        else
        {
            System.out.println("arrays are different");
        }
        //2.7
        System.out.println("Task 2.7");
        array = new int[6];
        count = 0;
        int value = random.nextInt(9) + 1;
        System.out.println("Ur number is: " + value);
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(10) + 1;
            System.out.print(array[i] + " ");
            if(array[i] == value)
            {
                count++;
            }
        }
        System.out.println();
        System.out.println("Values repeat: " + count + " times");
        //2.8
        System.out.println("task 2.8");
        int maxValue = Integer.MIN_VALUE;
        array = new int[7];
        int penultimateValue = 0;
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(9) + 1;
            System.out.print(array[i] + " ");
            if(maxValue < array[i])
            {
                maxValue = array[i];
            }
            if(minValue > array[i])
            {
                minValue = array[i];
            }
        }
        penultimateValue = minValue;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < maxValue && penultimateValue < array[i])
            {
                penultimateValue = array[i];
            }
        }
        System.out.println("penultimate value of array is: " + penultimateValue);
        //2.9
        System.out.println("Task 2.9");
        array = new int[5];
        minValue = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++)
        {
            array[i] = random.nextInt(9) + 1;
            System.out.print(array[i] + " ");
            if(i % 2 == 0)
            {
                if(array[i] < minValue)
                {
                    minValue = array[i];
                }
            }
        }
        System.out.println("min value is: " + minValue);
        //2.10
        System.out.println("Task 2.10");
        array = new int[]{5, 3, 7, 18, 22, 1};
        maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++)
        {
            if(maxValue < array[i])
            {
                maxValue = array[i];
            }
        }
        System.out.println("Array with indes 0 befor swap is: " + array[0]);
        array[0] = maxValue;
        System.out.println("Array with index 0 after swap is: " + array[0]);
    }
}
