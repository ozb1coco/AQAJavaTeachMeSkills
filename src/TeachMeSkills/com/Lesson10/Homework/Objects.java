package TeachMeSkills.com.Lesson10.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Objects {
    Scanner scanner = new Scanner(System.in);

    public void print(){
        List<Integer> marks1 = new ArrayList<>();
        marks1.add(6);
        marks1.add(9);
        Student student1 = new Student(18, "Serghei", marks1);
        List<Integer> marks2 = new ArrayList<>();
        marks2.add(7);
        marks2.add(6);
        Student student2 = new Student(19, "Kirill", marks2);
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        List<Integer> allMarks = new ArrayList<>(marks1);
        allMarks.addAll(marks2);
        MarksOperations marksOperations = new MarksOperations(allMarks);
        University university = new University("GGTY im P.O.Sykhogo", students, marksOperations.averageMarks(allMarks));
        System.out.println(students);
        System.out.println(university);
        menu();
    }
    private void menu(){
        List<Student> students = new ArrayList<>();
        for(;;) {
            System.out.println("Hello, enter ur action " +
                    "\n 1) Add student: " +
                    "\n 2) Search by name student: " +
                    "\n 3) Delete student from university: " +
                    "\n 4) Exit");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    FunctionalService addStudent = new FunctionalService();
                    addStudent.addStudentToUniversity(students);
                    System.out.println(students);
                    break;
                case 2:
                    FunctionalService search = new FunctionalService();
                    search.searchStudentByName(students);
                    System.out.println(students);
                    break;
                case 3:
                    FunctionalService delete = new FunctionalService();
                    delete.removeStudentFromCollection(students);
                    System.out.println(students);
                    break;
                case 4:
                    return;
            }
        }
    }
}


