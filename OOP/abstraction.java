import java.util.Arrays;
import java.util.List;

public class abstraction {
    // Create abstract class Person
    public static abstract class Person {
        protected String name;
        public Person(String name) {
            this.name = name;
        }
        protected void sayHello() {
            System.out.println("Hello, " + name + "!");
        }
        public abstract void print();
    }
    // Extends from Person
    public static class Instructor extends Person {
        private List<String> coursesCreated;
        public Instructor(String name, List<String> coursesCreated) {
            super(name);
            this.coursesCreated = coursesCreated;
        }
        public void print() {
            sayHello();
            System.out.println("Instructor has created:");
            for (String course: coursesCreated) {
                System.out.println("\t- " + course);
            }
        }
    }
    // Extends from Person
    public static class Student extends Person {
        private String lastCourseTaken;
        public Student(String name, String lastCourseTaken) {
            super(name);
            this.lastCourseTaken = lastCourseTaken;
        }
        public void print() {
            sayHello();
            System.out.println("Student last taken course: " + lastCourseTaken);
        }
    }

    public static void main(String[] args) {
        Person miller = new Instructor("Miller", Arrays.asList("Understanding Modern Data Architecture", "Introduction to Object-Oriented Programming in Java"));
        miller.print();
        Person john = new Student("John Doe", "Understanding Modern Data Architecture");
        john.print();
    }
}