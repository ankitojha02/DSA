package OOPs;

public class polymorphism {
    public static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    public static class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }
    public static class Cat extends Animal {
        void sound() {
            System.out.println("Cat meows");
        }
    }
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference, Animal object
        Animal myDog = new Dog(); // Animal reference, Dog object
        Animal myCat = new Cat(); // Animal reference, Cat object   
        myAnimal.sound(); // Outputs: Animal makes a sound
        myDog.sound(); // Outputs: Dog barks
        myCat.sound(); // Outputs: Cat meows
    }
}
