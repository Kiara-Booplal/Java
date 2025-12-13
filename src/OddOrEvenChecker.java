import java.util.*;
public class OddOrEvenChecker {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you number: ");

        int number = scanner.nextInt();
        oddEvenChecker(number);
        scanner.close();
    }

    private static void oddEvenChecker(int number){
        if (number % 2 == 0){
            System.out.println("The number you have entered is Even");
        }
        else {
            System.out.println("The number you have entered is odd");

        }
    }
}
