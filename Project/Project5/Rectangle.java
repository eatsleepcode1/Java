public class Rectangle {
    private double length;
    private double width;
    private static int rectangleNumber;

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    static int getRectangleNumber(){
        return rectangleNumber;
    }
    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
        rectangleNumber++;
    }
    public double computeArea(){
        return length * width;
    }
    public Rectangle(){
        length = 0;
        width = 0;
    }
}
