import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Creating array with any dimension
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array dimension");
        int dimension = scanner.nextInt();
        Integer[] array = new Integer[dimension];

        //Filling array with random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        MinValue(array);
        MaxValue(array);
        AverageValue(array);
    }
    private static void AverageValue(Integer[] array) {
        float average;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        average = (float) sum / array.length;
        System.out.printf("Average number = %.2f%n", average);
    }

    private static void MaxValue(Integer[] array) {
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if(array[j] > max){
                max = array[j];
            }
        }
        System.out.println("Maximum number = " + max);
    }

    private static void MinValue(Integer[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Minimum number = " + min);
    }
}
