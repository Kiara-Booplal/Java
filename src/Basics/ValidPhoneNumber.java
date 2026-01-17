package Basics;

import java.util.*;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you South African Phone Number: ");
        String phoneNumber = input.nextLine();
        if (phoneNumber.length() == 10 && String.valueOf(phoneNumber.charAt(0)).equals("0") && isDigit(phoneNumber)) {
            System.out.println("valid");


        } else {
            System.out.println("Invalid");
        }
        input.close();
    }

    private static boolean isDigit(String phoneNumber) {
        for (int i = 1; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (String.valueOf(ch).equals("0") || String.valueOf(ch).equals("1") ||
                    String.valueOf(ch).equals("2") || String.valueOf(ch).equals("3") ||
                    String.valueOf(ch).equals("4") || String.valueOf(ch).equals("5") ||
                    String.valueOf(ch).equals("6") || String.valueOf(ch).equals("7") ||
                    String.valueOf(ch).equals("8") || String.valueOf(ch).equals("9")){
                return true;
            }
        }
        return false;
    }

}
