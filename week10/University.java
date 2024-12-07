import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class University {
    private Map<String, Course> courses = new HashMap<>();

    public void addCourse(Course course) {
        if (course != null && !courses.containsKey(course.getCourseName()))
            courses.put(course.getCourseName(), course);
    }

    public void registerStudentForCourse(Student student, Course course) {
        if (courses.containsKey(course.getCourseName())) {
            courses.get(course.getCourseName()).addStudent(student);
        }
    }

    public void printEnrollments() {
        for (Course course : courses.values()) {
            System.out.println("Course: " + course.getCourseName());
            for (Student student : course.getStudents()) {
                System.out.println("Student: " + student.getName());
            }
        }
    }
}
