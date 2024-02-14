public class Circle {
    private double radius;
    private static int circleNumber;

    public static int getCircleNumber() {
        return circleNumber;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public Circle(double radius){
        this.radius = radius;
        circleNumber++;
    }
    public double computeArea(){
        return (Math.PI * Math.pow(radius, 2));
    }
    public Circle(){
        radius = 0;
    }
}
