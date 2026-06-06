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
    }
}
