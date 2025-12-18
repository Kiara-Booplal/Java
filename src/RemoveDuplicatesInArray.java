import java.util.Arrays;

public class RemoveDuplicatesInArray {
    public static void main(String [] args){
        int [] array = {1,2,2,3,3,4};
        int count =0;
        int i =0;

        for (i=0; i< array.length-1;i++){
            if(array[i] != array[i+1]){
                array[count] = array[i];
                count++;
            }
        }
        array[count] = array[i];

        System.out.print("[");
        for(int j = 0; j<= count;j++){
            System.out.print(array[j]);
            if(j != count) {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
