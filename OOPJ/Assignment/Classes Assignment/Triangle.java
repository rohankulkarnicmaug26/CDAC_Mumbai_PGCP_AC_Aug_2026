public class Triangle
{
	
	
    int Side1;
    int Side2;
    int Side3;

    Triangle(int Side1, int Side2, int Side3) {
        this.Side1 = Side1;
        
        this.Side2 = Side2;
        
        this.Side3 = Side3;
    }

    public static void main(String[] args)
    {
        Triangle objTriangle = new Triangle(3, 4, 5);

        int Perimeter = objTriangle.Side1
                      + objTriangle.Side2
                      + objTriangle.Side3;

        int Area = (objTriangle.Side1 * objTriangle.Side2) / 2;

        System.out.println("Area: " + Area);
        System.out.println("Perimeter: " + Perimeter);
    }
}