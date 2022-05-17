import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array dimension from 5 to 10");
        int dimension = scanner.nextInt();

        while(true){
            if(dimension <= 5 || dimension > 10){
                System.out.println("Re-enter dimension");
                 dimension = scanner.nextInt();
            }
            else break;
        }
        Integer[] array = new Integer[dimension];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()* 100) + 1);
        }
        System.out.println("Your array with custom dimension generated\n " + Arrays.toString(array));

        int evenElementsInArrayCount = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                evenElementsInArrayCount++;
            }
        }
        Integer[] newArray = new Integer[evenElementsInArrayCount];
        int iteration = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
               newArray[iteration] = array[i];
               iteration++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
