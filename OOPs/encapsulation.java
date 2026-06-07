package OOPs;

public class encapsulation {

    // Encapsulation: Data hiding and providing access through methods
    public static class Student {
        private String name; // Private variable
        private int age; // Private variable
        private double cgpa; // Private variable

        // Getter and Setter for name
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for age
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        // Getter and Setter for cgpa
        public double getCgpa() {
            return cgpa;
        }
        public void setCgpa(double cgpa) {
            this.cgpa = cgpa;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("CGPA: " + cgpa);
        }
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        Student student1 = new Student(); // Object banaya
        student1.setName("John");
        student1.setAge(20);
        student1.setCgpa(3.5);  
        Student student2 = new Student(); // Dusra object banaya
        student2.setName("Alice");
        student2.setAge(22);
        student2.setCgpa(3.8);
        student1.display();
        student2.display();
    }
}
