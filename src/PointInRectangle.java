import java.util.Scanner;
public class PointInRectangle {
    private final double width;
    private final double height;
    private final double[] center;

    public PointInRectangle(double width, double height){
        this(width,height, 0.0d,0.0d);
    }

    public PointInRectangle(double width, double height, double x, double y){
        this.width = width;
        this.height = height;
        this.center = new double[]{x, y};
    }

    public PointInRectangle(int width, int height){
        this(width,height, 0,0);
    }

    public PointInRectangle(int width, int height, int x, int y){
        this(width,height, x,(double)y);
    }

    private boolean isWithinTop(double y){
        return (y<=center[1]+height/2);
    }

    private boolean isWithinBottom(double y){
        return (y>=center[1]-height/2);
    }

    private boolean isWithinRight(double x){
        return (x<=center[0]+width/2);
    }

    private boolean isWithinLeft(double x){
        return (x>=center[0]-width/2);
    }

    public boolean isWithinRectangle(double x, double y){
        return (this.isWithinRight(x) && this.isWithinLeft(x) && this.isWithinTop(y) && this.isWithinBottom(y));
    }

    public boolean isWithinRectangle(int x, int y){
        return  isWithinRectangle(x,(double)y);
    }
}

class TestingPointInRectangle {
    public static void main(String[] args) {
        PointInRectangle pir = new PointInRectangle(10,5, 0,0);

        boolean flag = true;
        while (flag) {
            System.out.print("Enter a point with two coordinates: ");
            var scan = new Scanner((System.in));
            String value1  = scan.next();
            String value2  = scan.next();
            if (value1.matches("^-?\\d*(\\.\\d*)?$") && value2.matches("^-?\\d*(\\.\\d*)?$")){
                flag=false;
                System.out.println("Point (" + Double.parseDouble(value1) + ", " + Double.parseDouble(value2) +") is " + (pir.isWithinRectangle(Double.parseDouble(value1),Double.parseDouble(value2))?"":"not ") +"in the rectangle");
            }else{
                System.out.println("Please enter a valid coordinate");
            }
        }
    }
}