package TeachMeSkills.com.com.Lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* System.out.println(((3 * 127) / 3.5 - 1));
        System.out.println((double)((10 * 599)/(10 + 150)) * (3 + 5));
        System.out.println((double) ((3 + 3) / (4 * 12)) + (double)(9 * 9)/71);
        if(5>3)
        {
            System.out.println("Hello");
        }
        int a = 3;
        switch (a)
        {
            case 1:
                System.out.println(a);
                break;
            case 2:
                System.out.println(a + 1);
                break;
            case 3:
                System.out.println(a + 2);
                break;*/
        Scanner scanner = new Scanner(System.in);

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
    }
}
