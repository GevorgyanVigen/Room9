import room.Student;

public class Lesson {
    public static void main(String[] args) { //psvm

        Student student = new Student();
        student.setName("Karen");
        student.setYear(2000);

        Student student1 = new Student();
        student1.setName("Ani");
        student1.setYear(2002);

        System.out.println(student.getYear());
        System.out.println(student1.getYear());
    }
}
