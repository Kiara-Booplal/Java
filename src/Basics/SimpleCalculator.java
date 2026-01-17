package Basics;

import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        input.nextLine();
        System.out.print("Choose operation + - * /: ");
        String sign = input.nextLine();

        switch (sign){
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            default: System.out.println("The sign you have entered is invalid");
        }
        input.close();
    }
}
