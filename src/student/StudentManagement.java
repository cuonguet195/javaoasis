package student;

public class StudentManagement {
    private Student[] students;
    private int count;

    public StudentManagement() {
        this.students = new Student[100];
        this.count = 0;
    }
    public void addStudent(Student newStudent){
        students[count] = newStudent;
        count++;
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }


    public static void main(String[] args) {
        Student s1 = new Student("a", "1", "1");
        Student s2 = new Student("b", "2", "1");
        Student s3 = new Student("c", "3", "1");
        Student s4 = new Student("d", "4", "1");

        s1.setGroup("K62CC");
        s3.setGroup("K62CC");

        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(s1);
        studentManagement.addStudent(s2);
        studentManagement.addStudent(s3);
        studentManagement.addStudent(s4);

        System.out.println(StudentManagement.sameGroup(s1, s2));

        for (int i = 0; i < studentManagement.count; i++) {
            Student s = studentManagement.students[i];
            System.out.println(s.getName());
//            System.out.println(s.getName());
        }
    }
}
