import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {2 , 7 , 3 , 8 , 5 , 8 , 21 , 13 , 55 , 34};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Enter number");
        int number = scanner.nextInt();

        int result = Arrays.binarySearch(array , number);
        if(result >= 0){
            System.out.println("Array contains number " + number);
        }
        else System.out.println("Array does not contain number " + number);
    }
}
