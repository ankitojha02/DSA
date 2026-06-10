package OOPs;

public class inheritance {


    public static void main(String[] args) {
        // Inheritance: Reusing code from a parent class
        class Animal {
            void eat() {
                System.out.println("This animal eats food.");
            }
        }

        class Dog extends Animal {
            void bark() {
                System.out.println("The dog barks.");
            }
        }

        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Dog's own method

        //Multiple Inheritance using Interfaces as Multiple inheritance is not supported in Java
        interface  Flyable  {
            void fly();
        }

        class Bird implements Flyable {
            public void fly() {
                System.out.println("The bird flies in the sky.");
            }
        }

        Bird bird = new Bird();
        bird.fly(); // Implemented method

    }
}
