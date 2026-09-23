import java.util.Scanner;

public class Complex {

    double real;
    double imaginary;

    Complex(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;
    }

    void sum(Complex c) {

        double realPart = real + c.real;
        double imaginaryPart = imaginary + c.imaginary;

        System.out.println("Sum = " + realPart + " + " + imaginaryPart + "i");
    }

    void difference(Complex c) {

        double realPart = real - c.real;
        double imaginaryPart = imaginary - c.imaginary;

        System.out.println("Difference = " +realPart + " + " + imaginaryPart +"i");
    }

    void product(Complex c) 
    {   double realPart = (real * c.real) - (imaginary * c.imaginary);

        double imaginaryPart = (real * c.imaginary) + (imaginary * c.real);

        System.out.println("Product = " + realPart +" + " + imaginaryPart + "i");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first complex number: ");

        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();

        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter second complex number: ");

        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();

        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);

        scanner.close();
    }
}