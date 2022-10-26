package TeachMeSkills.com.com.Lesson5.HomeWork;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int DDR;
    int HDD;
    int resource;
    Scanner scanner = new Scanner(System.in);

    public Computer(String processor, int DDR, int HDD, int resource) {
        this.processor = processor;
        this.DDR = DDR;
        this.HDD = HDD;
        this.resource = resource;
    }

    public void PrintFullInformation(String processor, int DDR, int HDD, int resource) {
        System.out.println("Processor: " + processor + " DDR: " + DDR + " HDD " + HDD + " Resource of cycles: " + resource);
    }

    public void TurnOnPC() {
        Random random = new Random();
        System.out.println("Enter value: ");
        int turnOnValue = scanner.nextInt();
        int turnOnRandomValue = random.nextInt(2);
        System.out.println(turnOnRandomValue);
        String turnOnInformation;
        if (turnOnValue == turnOnRandomValue) {
            turnOnInformation = "Ur PC is TURN ON";
            System.out.println(turnOnInformation);
        } else {
            turnOnInformation = "Error ur PC is didn't turn on";
            System.out.println(turnOnInformation);
        }
    }

    public void TurnOffPC() {
        Random random = new Random();
        System.out.println("Enter value: ");
        int turnOffValue = scanner.nextInt();
        int turnOffRandomValue = random.nextInt(2);
        System.out.println(turnOffRandomValue);
        String turnOffInformation;

        if (turnOffValue == turnOffRandomValue) {
            turnOffInformation = "Ur PC is TURN OFF";
            System.out.println(turnOffInformation);
        } else {
            turnOffInformation = "Error ur PC is didn't turn Off";
            System.out.println(turnOffInformation);
        }
    }

    public void Limits(int count) {
        if (count >= resource) {
            System.out.println("Resources of cycles out of limit");
        } else {
            System.out.println("The value of cycles working ur PC is: " + (resource - count));
        }
    }
}
