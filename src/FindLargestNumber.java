public class FindLargestNumber {
    public static void main(String [] args){
        int[] array = {5,2006,6,9,90,596,1};
        int maxValue = array[0];
        for (int j : array) {
            if (j > maxValue) {
                maxValue = j;
                break;
            }
        }
        System.out.println("The highest value is " + maxValue);
    }
}
