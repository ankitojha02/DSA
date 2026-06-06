package OOPs;

public class user_defined_datatype {
    public static class Student { // Khudka data type banaya
        String name;
        int age;
        double cgpa;
    }
    public static void main(String[] args) {
        Student student1 = new Student(); // Object banaya
        student1.name = "John";
        student1.age = 20;
        student1.cgpa = 3.5;

        Student student2 = new Student(); // Dusra object banaya
        student2.name = "Alice";
        student2.age = 22;
        student2.cgpa = 3.8;

        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age + ", CGPA: " + student1.cgpa);
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age + ", CGPA: " + student2.cgpa);

        // Passing object to method
        printStudentDetails(student1);
    }
    public static void printStudentDetails(Student student) {
        System.out.println("Student Details: " + student.name + ", Age: " + student.age + ", CGPA: " + student.cgpa);
    }
}
