package ClassAndObjectsBasics.RectangleUtility;

public class RectangleUtilityDemo {
    public static void main(String [] args){
        RectangleUtility rectangle = new RectangleUtility(3,2);
        System.out.println("The area is "+rectangle.area());
        System.out.println("The perimeter is "+rectangle.perimeter());
        System.out.println("Is this a square?  "+rectangle.isSquare());
        System.out.println();

        RectangleUtility square = new RectangleUtility(5,5);
        System.out.println("The area is "+ square.area());
        System.out.println("The perimeter is "+ square.perimeter());
        System.out.println("Is this a square?  "+ square.isSquare());
    }
}
