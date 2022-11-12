package TeachMeSkills.com.Lesson10.Homework;

import java.util.ArrayList;
import java.util.List;
public class Student {
    int age;
    String name;
    List<Integer> marks;
    public Student(int age, String name, List<Integer> marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
