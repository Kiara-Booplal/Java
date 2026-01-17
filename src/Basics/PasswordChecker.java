package Basics;

import java.util.*;
public class PasswordChecker {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in your password: ");
        String password = input.nextLine();
        boolean upper = false;
        boolean lower = false;
        boolean digit= false;
        boolean special = false;
        int flagCount = 0;

        if(password.length()<8){
            System.out.println("WEAK");
        }
        else{
            for (int i = 0; i< password.length(); i++){
                char ch = (password.charAt(i));
                if(Character.isUpperCase(ch)){
                    upper = true;
                }
                else if(Character.isLowerCase(ch)){
                    lower = true;
                }
                else if(Character.isDigit(ch)){
                    digit = true;
                }
                else if(isSpecialCharacter(String.valueOf(ch))){
                    special = true;
                }
            }
           if(lower){
               flagCount++;
           }
           if(upper){
               flagCount++;
           }
           if(special){
               flagCount++;
           }
           if(digit){
               flagCount++;
           }

           if(flagCount< 3){
               System.out.println("WEAK");
           }
           if(flagCount==3){
               System.out.println("MEDIUM");
           }
           if(flagCount ==4 ){
               System.out.println("Strong");
           }
        }


    }

    private static boolean isSpecialCharacter(String specialCh){
        return specialCh.equals("!") || specialCh.equals("@") || specialCh.equals("#") || specialCh.equals("$") || specialCh.equals("%") ||
                specialCh.equals("&") || specialCh.equals("*") || specialCh.equals("^") || specialCh.equals("?") || specialCh.equals("/");
    }

}
