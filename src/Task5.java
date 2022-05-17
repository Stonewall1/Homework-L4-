import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()*100) + 1);
        }
        System.out.println("Generated array\n" + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(i % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println("Zero-modified array\n" + Arrays.toString(array));
    }
}
