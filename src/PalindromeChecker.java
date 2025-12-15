import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        String wordBackwards= "";
        for(int i = word.length()-1; i >= 0; i--){
            wordBackwards = wordBackwards + word.charAt(i);
        }
        System.out.println(wordBackwards);
        if(word.equals(wordBackwards)){
            System.out.println("This word is a palindrome.");
        }
        else{
            System.out.println("This is not a palindrome");
        }

        input.close();
    }
}
