public class Circle extends Shape implements Resizeable{
    public double radius = 5.0;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public String toString() {
        return "Pre-resize area of circle: " + getArea();
    }

    @Override
    public double resize(double percent) {
        return getArea()*percent*percent/(100*100);
    }
}
