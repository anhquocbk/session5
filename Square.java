public class Square extends Shape implements Resizeable,Colorable {
    public double size = 4.0;

    public Square(){

    }
    public Square(double size){
        this.size = size;
    }
    public void setSize(double size) {
        this.size = size;
    }
    public double getSize() {
        return size;
    }
    public double getArea() {
        return size*size;
    }
    public String toString() {
        return "Pre-resize area of Square: " + getArea();
    }

    @Override
    public double resize(double percent) {
        return getArea()*percent*percent/10000;
    }

    @Override
    public String howToColor() {
       return "Color all four sizes.";
    }
}
