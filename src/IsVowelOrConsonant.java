import java.util.*;
public class IsVowelOrConsonant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        if(character == 'a' || character == 'e' || character == 'i'|| character == 'o' || character == 'u'){
            System.out.println("It is a vowel");
        }
        else {
            System.out.println("It is a consonant");
        }
        input.close();
    }
}
