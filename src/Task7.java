import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        //Array creation
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()*100) + 1);
        }
        System.out.println("Unsorted array\n" + Arrays.toString(array));
        //Bubble sort
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - (i + 1); j++) {
                if(array[j] > array[j + 1]){
                    int save = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = save;
                }
            }
        }
        System.out.println("BubbleSorted array\n" + Arrays.toString(array));
    }
}
