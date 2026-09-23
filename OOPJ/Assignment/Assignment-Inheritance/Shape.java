public class Shape {

    public static void main(String[] args) {

        SquareShape square = new SquareShape();

        square.showShape();
        square.showRectangle();
        square.showSquare();
    }

    public void showShape() {

        System.out.println("This is shape");
    }
}


class RectangleShape extends Shape {

    public void showRectangle() {

        System.out.println("This is rectangular shape");
    }
}


class CircleShape extends Shape {

    public void showCircle() {

        System.out.println("This is circular shape");
    }
}


class SquareShape extends RectangleShape {

    public void showSquare() {

        System.out.println("Square is a rectangle");
    }
}