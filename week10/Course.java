

import java.util.ArrayList;
import java.util.List;

public class Course {
    private static int totalCourses = 0;
    private String courseName;
    private final int capacity;
    private List<Student> students = new ArrayList<>();

    public Course(String name, int capacity) {
        this.courseName = name;
        this.capacity = capacity;
        totalCourses++;
    }

    public void addStudent(Student student) {
        if (students.size() < capacity)
            students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public List<Student> getStudents() {
        return students;
    }
}
