import java.util.*;
public class CountCharacters {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in a string: ");
        String line = input.nextLine();
        int count = 1;
        String result ="";
        char letter = ' ';
        int i = 0;

        for( i=0; i < line.length()-1; i++){
            if(String.valueOf(line.charAt(i+1)).equals(String.valueOf(line.charAt(i)))){
                count++;
            }
            else {
                result = result + line.charAt(i) + count ;
                count = 1;
            }
        }
        System.out.println(result + line.charAt(i)+count);
        input.close();
    }
}
