package classes;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("toba", "CSC/2016/099", "CSC");
        System.out.println(student1.getName());

        student1.setName("promise");

        System.out.println(student1.getName());
    }
}
