public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {
    private final double x;
    private final double y;
    private final double radius;

    public Circle2D(){
        this.x = 0d;
        this.y = 0d;
        this.radius = 1d;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    public double getPerimeter() {
        return 2d * Math.PI * this.getRadius();
    }

    public boolean contains(double x, double y) {
        return this.getRadius()>=Math.sqrt(Math.pow(this.getX()-x,2d) + Math.pow(this.getY()-y,2d));
    }

    public boolean overlaps(Circle2D circle2D) {
        return new Circle2D(this.getX(), this.getY(), this.getRadius()+circle2D.getRadius()).contains(circle2D.getX(), circle2D.getY());
    }

    public boolean contains(Circle2D circle2D) {
        return this.getRadius() > circle2D.getRadius() && new Circle2D(this.getX(), this.getY(), this.getRadius()-circle2D.getRadius()).contains(circle2D.getX(), circle2D.getY());
    }
}
