package TeachMeSkills.com.Lesson5.HomeWork;

import java.util.Objects;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        int countOfResourse = 0;
        Computer computer = new Computer("Intel", 1028, 512, 500);
        computer.PrintFullInformation("Intel", 1028, 512, 500);
        Scanner scanner = new Scanner(System.in);
        String button;
        do {
            computer.TurnOnPC();
            computer.TurnOffPC();
            countOfResourse++;
            computer.Limits(countOfResourse);
            System.out.println("If u want to exit press 10 if not press any button: ");
            button = scanner.nextLine();
        } while (!Objects.equals(button, "10"));
    }
}
