import student.Student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("cuong","2002","a");
        Student student2 = new Student(student1);
//        student.setGroup("abc");
//        student.setName("abc");

        System.out.println(student2.getName());
//        System.out.println(student2.getId());
//        System.out.println(student2.getEmail());
//        System.out.println(student2.getInfo());
    }
}
