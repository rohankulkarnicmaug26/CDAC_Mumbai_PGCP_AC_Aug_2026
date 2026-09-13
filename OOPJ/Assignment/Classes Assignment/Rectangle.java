public class Rectangle
{
    int Length;
    int Breadth;

    Rectangle(int Length, int Breadth)
    {
        this.Length = Length;
        this.Breadth = Breadth;
    }

    int area()
    {
        return Length * Breadth;
    }

    public static void main(String[] args)
    {
        Rectangle objRectangle1 = new Rectangle(4, 5);
        Rectangle objRectangle2 = new Rectangle(5, 8);

        System.out.println("Area of Rectangle 1: " + objRectangle1.area());
        System.out.println("Area of Rectangle 2: " + objRectangle2.area());
    }
}