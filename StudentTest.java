public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("John", "CS", 3.5);

        Student student2 = new Student();
        student2.setName("Johnny");
        student2.setMajor("CS");
        student2.setGpa(3.3);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }
}
