package OOPs;

class Complex {
    int x;
    int y;
   
    Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printComplex() {
        System.out.println(x + " + " + y + "i");
    }

    void add(Complex other) {
        this.x += other.x;
        this.y += other.y;
    }

    void multiply(Complex other) {
        int realPart = this.x * other.x - this.y * other.y;
        int imaginaryPart = this.x * other.y + this.y * other.x;
        this.x = realPart;
        this.y = imaginaryPart;
    }
}
public class complex_number {
    public static void main(String[] args) {
        // Create complex numbers
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);

        c1.printComplex();
        c2.printComplex();
        // Perform operations
        c1.add(c2);
        Complex product = new Complex(c1.x, c1.y); // Create a copy of c1 for multiplication
        product.multiply(c2);

        // Display results
        System.out.println("Sum: " + c1.x + " + " + c1.y + "i");
        System.out.println("Product: " + product.x + " + " + product.y + "i");
    }
}
