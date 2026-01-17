package Basics;

public class CountOccureneceOfNumbers {
    public static void main(String[] args){
        int [] array = {1,3,1,6,7,7,7};
        int search = 7;
        int count =0;
        for(int j : array){
            if(j == search){
                count++;
            }
        }
        System.out.println("The number you are searching has appeared: " + count + " times");

    }
}
