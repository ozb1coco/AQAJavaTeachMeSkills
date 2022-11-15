package TeachMeSkills.com.Lesson10.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalService {
    Scanner scanner = new Scanner(System.in);

    public void removeStudentFromCollection(List<Student> students) {
        System.out.println("Enter number for remove from list: ");
        int choose = scanner.nextInt();
        if (choose <= students.size()) {
            students.remove(choose);
        }
    }

    public void searchStudentByName(List<Student> students) {
        System.out.println("Enter name for search: ");
        String searchName = scanner.nextLine();
        int count = 0;
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Searching name didn't found");
        } else {
            System.out.println("Searching name was found");
        }
    }

    public Student addStudentToUniversity(List<Student> students) {
        System.out.println("Enter student to add to University, enter marks: ");
        List<Integer> mark = new ArrayList<>();
        mark.add(scanner.nextInt());
        mark.add(scanner.nextInt());
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("enter age student: ");
        int age = scanner.nextInt();
        Student student = new Student(age, name, mark);
        students.add(student);
        return student;
    }
}
