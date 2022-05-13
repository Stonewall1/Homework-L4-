import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        if (Arrays.binarySearch(array, number) < 0) {
            System.out.println("No such number in array");
        }
        else {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }
            list.removeAll(Collections.singleton(number));
            Integer[] newArray = new Integer[list.size()];
            list.toArray(newArray);
            System.out.println(Arrays.toString(newArray));
        }
    }
}
