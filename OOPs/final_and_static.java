package OOPs;

class Cricketer {
    final String country = "India"; // Final variable, cannot be changed once assigned
    int runs;
    String name;
    double average;
}
public class final_and_static {
    public static void main(String[] args) {
        Cricketer cricketer1 = new Cricketer();
        cricketer1.name = "Virat Kohli";
        cricketer1.runs = 12000;
        cricketer1.average = 50.5;

        System.out.println("Cricketer Name: " + cricketer1.name);
        System.out.println("Runs: " + cricketer1.runs);
        System.out.println("Average: " + cricketer1.average);
        System.out.println("Country: " + cricketer1.country);

        // Attempting to change the final variable will result in a compile-time error
        // cricketer1.country = "Australia"; // This line will cause an error
        Cricketer cricketer2 = new Cricketer();
        cricketer2.name = "Sachin Tendulkar";
        cricketer2.runs = 15000;
        cricketer2.average = 45.0;

        System.out.println("Cricketer Name: " + cricketer2.name);
        System.out.println("Runs: " + cricketer2.runs);
        System.out.println("Average: " + cricketer2.average);
        System.out.println("Country: " + cricketer2.country);

        
        
    }


    // Static variables and methods belong to the class rather than to any specific instance. They can be accessed without creating an object of the class.
    static class MathUtils {
        static double pi = 3.14159; // Static variable
    }
}
