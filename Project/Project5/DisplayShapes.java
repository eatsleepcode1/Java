//Create a class named Rectangle. Implement Rectangle in its own file.
//Create a class named Circle. Implement Circle in its own file.
public class DisplayShapes {
    Rectangle rectangleOne = new Rectangle(4, 6);
    Rectangle rectangleTwo = new Rectangle(5.2, 8.7);

    Circle circleOne = new Circle(4);
    Circle circleTwo = new Circle(3.2);


    public void rectanglePrintInfo(){
        System.out.println("Rectangle with sides " + rectangleOne.getLength() + " and " + rectangleOne.getWidth() + " has an area of " + rectangleOne.computeArea());
        System.out.println("Rectangle with sides " + rectangleTwo.getLength() + " and " + rectangleTwo.getWidth() + " has an area of " + rectangleTwo.computeArea());
    }
    public void circlePrintInfo(){
        System.out.println("Circle with radius " +  circleOne.getRadius() + " has an area of " + circleOne.computeArea());
        System.out.println("Circle with radius " + circleTwo.getRadius() + " has an area of " + circleTwo.computeArea());
    }
    public void printShapesTypes(){
        System.out.println("The number of rectangles created are " + rectangleTwo.getRectangleNumber() + " and the number of circles created are " + circleTwo.getCircleNumber());
    }
    public void printShapesTotal(){
        int shapes = rectangleTwo.getRectangleNumber() + circleTwo.getCircleNumber();
        System.out.println( shapes + " shapes were created in total.");
    }
}
