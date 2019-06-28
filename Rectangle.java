public class Rectangle extends Shape implements Resizeable{
    public double with = 1.0;
    public double height = 2.0;

    public Rectangle(){

    }
    public Rectangle(double with, double height){
        this.with = with;
        this.height = height;
    }
    public void setWith(double with) {
        this.with = with;
    }
    public double getWith() {
        return with;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return with*height;
    }
    public String toString() {
        return "Pre-resize area of rectangle: " + getArea();
    }

    @Override
    public double resize(double percent) {
        return getArea()*percent*percent/(100*100);
    }
}
