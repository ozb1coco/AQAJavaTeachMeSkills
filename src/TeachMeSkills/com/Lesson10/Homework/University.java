package TeachMeSkills.com.Lesson10.Homework;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String nameUniversity;
    private List<Student> students;
    double rating;

    public University(String nameUniversity, List<Student> students, double rating) {
        this.nameUniversity = nameUniversity;
        this.students = students;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameUniversity='" + nameUniversity + '\'' +
                ", students=" + students +
                ", rating=" + rating +
                '}';
    }
}
