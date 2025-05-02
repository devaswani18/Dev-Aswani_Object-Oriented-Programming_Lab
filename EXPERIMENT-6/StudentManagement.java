import StudentRecords.Student;

public class StudentManagement {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice Johnson", "A");
        Student student2 = new Student(102, "Bob Smith", "B+");

        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}