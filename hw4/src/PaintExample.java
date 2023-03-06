public class PaintExample {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(6, 0);
        Point point4 = new Point(0, 5);
        Point point5 = new Point(0, 5);
        Point point6 = new Point(5, 5);
        Point point7 = new Point(5, 0);

        Circle circle = new Circle(point2, 5);
        Rectangle rectangle = new Rectangle(point1, point2, point3, point4);
        Square square = new Square(point1, point7, point6, point5);
        Triangle triangle = new Triangle(point1, point2, point3);

        System.out.println("-------------------------------------------------------------------------");

        FigureUtil.draw(circle);
        FigureUtil.draw(circle, Color.ORANGE);
        System.out.println("Площадь: " + FigureUtil.area(circle));
        System.out.println("Периметр: " + FigureUtil.perimeter(circle));

        System.out.println("-------------------------------------------------------------------------");

        FigureUtil.draw(rectangle);
        FigureUtil.draw(rectangle, Color.PURPLE);
        System.out.println("Площадь: " + FigureUtil.area(rectangle));
        System.out.println("Периметр: " + FigureUtil.perimeter(rectangle));

        System.out.println("-------------------------------------------------------------------------");

        FigureUtil.draw(square);
        FigureUtil.draw(square, Color.BLUE);
        System.out.println("Площадь: " + FigureUtil.area(square));
        System.out.println("Периметр: " + FigureUtil.perimeter(square));

        System.out.println("-------------------------------------------------------------------------");

        FigureUtil.draw(triangle);
        FigureUtil.draw(triangle, Color.RED);
        System.out.println("Площадь: " + FigureUtil.area(triangle));
        System.out.println("Периметр: " + FigureUtil.perimeter(triangle));

        System.out.println("-------------------------------------------------------------------------");

    }
}