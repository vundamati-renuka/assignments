package FirstWeekAssignments;

public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Overriding the area method
    @Override
    public double area() {
        return width * height;
    }
}
