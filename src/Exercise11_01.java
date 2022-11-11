public class Exercise11_01 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 1.5, 1);
        triangle.setColor("yellow");
        triangle.setFilled(true);

        System.out.println(triangle);
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is "
                + triangle.getPerimeter());
        System.out.println(triangle);
    }

    public static Triangle constructTester(){
        return new Triangle();
    }

    public static Triangle constructTester(double side1, double side2, double side3){
        return new Triangle(side1,side2,side3);
    }
}

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private final java.util.Date dateCreated;

    /** Construct a default geometric object */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }
    /** Construct a geometric object with the specified color
     * and filled value */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     its getter method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
        this.side1=this.side2=this.side3=1.0d;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p = this.getPerimeter()/2.0d;
        return Math.sqrt(p*(p-this.getSide1())*(p-this.getSide2())*(p-this.getSide3()));
    }

    public double getPerimeter(){
        return this.getSide1()+this.getSide2()+this.getSide3();
    }

    @Override
    public String toString(){
        return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3;
    }
}
