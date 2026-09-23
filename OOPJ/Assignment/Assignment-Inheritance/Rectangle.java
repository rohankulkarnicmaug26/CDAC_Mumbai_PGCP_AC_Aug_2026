public class Rectangle {

    public static void main(String[] args) {

        System.out.print("Enter Rectangle Length: ");
        float length = ConsoleInput.getFloat();

        System.out.print("Enter Rectangle Breadth: ");
        float breadth = ConsoleInput.getFloat();

        RectangleData rectangle = new RectangleData(length, breadth);

        System.out.println("----- Rectangle -----");

        rectangle.printArea();
        rectangle.printPerimeter();

        System.out.print("Enter Square Side: ");
        float side = ConsoleInput.getFloat();

        Square square = new Square(side);

        System.out.println("----- Square -----");

        square.printArea();
        square.printPerimeter();
    }
}


class RectangleData {

    protected float length;
    protected float breadth;

    public RectangleData(float length, float breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {

        float area = length * breadth;

        System.out.println("Area: " + area);
    }

    public void printPerimeter() {

        float perimeter = 2 * (length + breadth);

        System.out.println("Perimeter: " + perimeter);
    }
}


class Square extends RectangleData {

    public Square(float side) {

        super(side, side);
    }
}