package Basics;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you sentence: ");
        String sentence = input.nextLine();
        String[] newSentence = sentence.split(" ");
        boolean [] counted = new boolean[newSentence.length];

        for(int i =0; i< newSentence.length; i++){
            if(counted[i]){
                continue;
            }
            int count =1;

            for(int j = i+1; j< newSentence.length; j++){
                if(newSentence[i].equals(newSentence[j])){
                    count++;
                    counted[j]=true;
                }
            }
            System.out.println(newSentence[i] + " = "+ count);
        }


    }
}
