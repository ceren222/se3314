

public class Student {
    private String studentName;
    private String studentID;

    public Student(String name, String id) {
        this.studentName = name;
        this.studentID = id;
    }

    public String getName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }
}
