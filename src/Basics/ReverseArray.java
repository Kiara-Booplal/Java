package Basics;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int [] array = {1,2,4,5};
        int [] newArray =  new int[4];
        int temp=0;

        for(int i = array.length-1; i >= 0; i--){
           newArray[temp] = array[i];
           temp ++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
