package ClassAndObjectsBasics.RectangleUtility;

public class RectangleUtility {
    private double height;
    private double width;

    public RectangleUtility(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double area(){
        return height * width;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

    public boolean isSquare(){
        return width == height;
    }

}
