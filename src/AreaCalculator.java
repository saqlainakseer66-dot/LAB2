public class AreaCalculator {
    public static void main (String[]args){
        AreaCalculator calc = new AreaCalculator();

        // Circle
        double circleArea = calc.area(5.0);
        System.out.println("Area of Circle (radius 5): " + circleArea);

        // Rectangle
        double rectangleArea = calc.area(4.0, 6.0);
        System.out.println("Area of Rectangle (4 x 6): " + rectangleArea);

        // Square
        double squareArea = calc.area(5);
        System.out.println("Area of Square (side 5): " + squareArea);
    }


    public double area ( double radius){
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    public double area ( double length, double width){
        return length * width;
    }

    // Area of Square
    public double area ( int side){
        return side * side;
    }
}

