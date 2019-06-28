import java.util.Scanner;

public class ResizeShape {
    public static void main(String[] args) {
        double percent;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter percent: ");
        percent = scanner.nextDouble();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Resizeable resizeable = (Rectangle) shape;
                System.out.println(shape.toString());
                System.out.println("After resize area of rectangle: " + resizeable.resize(percent));
                System.out.println(" ");
            } else if (shape instanceof Circle) {
                Resizeable resizeable = (Circle) shape;
                System.out.println(shape.toString());
                System.out.println("After resize area of circle: " + resizeable.resize(percent));
                System.out.println(" ");
            } else if (shape instanceof Square) {
                Resizeable resizeable = (Square) shape;
                System.out.println(shape.toString());
                System.out.println("After resize area of square: " + resizeable.resize(percent));
                System.out.println("Make color: " + ((Square) shape).howToColor());
            }
        }
    }
}