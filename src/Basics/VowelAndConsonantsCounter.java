package Basics;

import java.util.*;
public class VowelAndConsonantsCounter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a sentence: ");
        String sentences = input.nextLine();
        int countVowel =0;
        int countConsonants = 0 ;
        for(int i = 0; i < sentences.length();i++){
            if(sentences.charAt(i) == 'a' || sentences.charAt(i) == 'e'|| sentences.charAt(i) == 'i' || sentences.charAt(i) == 'o' || sentences.charAt(i) == 'u'){
                countVowel++;
            }
            else if(sentences.charAt(i) != ' '){
                countConsonants++;
            }
        }
        System.out.println("The number of vowels is: " + countVowel + " and the number of consonants is: " + countConsonants);
        input.close();
    }
}
