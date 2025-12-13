import java.util.*;
public class OddEvenChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Odd Or Even Checker, Enter your number: " );
        int number = scanner.nextInt();
        isOddOrEven(number);

        scanner.close();
    }

    public static void isOddOrEven(int num){
        if (num % 2 == 0 ){
            System.out.println("The number you have entered is Even");
        }
        else {
            System.out.println("The number you have entered is Odd");
        }
    }
}