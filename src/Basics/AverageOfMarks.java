package Basics;

import java.util.*;
public class AverageOfMarks {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int [] marksArray = new int[5];
        int result = 0;
        for(int i =0; i< marksArray.length; i++){
            System.out.print("Enter the mark: ");
            marksArray[i] = input.nextInt();
            result = result + marksArray[i];
        }
        result = result/5;
        System.out.println("The average is: " + result);

        input.close();
    }
}
