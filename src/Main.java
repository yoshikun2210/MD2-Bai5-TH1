public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Nam");
        Student s2 = new Student(222, "Chinh");
        Student s3 = new Student(333, "Dung");
        s1.display();
        s2.display();
        s3.display();
    }
}
