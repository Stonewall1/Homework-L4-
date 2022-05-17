import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        // 2 arrays created
        Integer[] firstArray = {1 , 34 , 3 , 87 , 301};
        Integer[] secondArray = {2 , 75 , 22 , 23 , 9800};
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        System.out.println("firstArrayAverage number = " +  firstArrayAverage(firstArray));
        System.out.println("secondArrayAverage number = " + secondArrayAverage(secondArray));

        if(firstArrayAverage(firstArray) < secondArrayAverage(secondArray)){
            System.out.println("secondArrayAverage number is bigger than firstArrayAverage number");
        }
        else if(firstArrayAverage(firstArray) > secondArrayAverage(secondArray)){
            System.out.println("firstArrayAverage number is bigger than secondArrayAverage number");
        }
        else System.out.println("Averages are equal");

    }
    private static float firstArrayAverage(Integer[] firstArray) {
        float firstArrayAverage;
        int sum = 0;
        for (int i = 0; i < firstArray.length; i++) {
            sum = sum + firstArray[i];
        }
        firstArrayAverage = (float) sum / firstArray.length;
        return firstArrayAverage;
    }

    private static float secondArrayAverage(Integer[] secondArray) {
        float secondArrayAverage;
        int sum = 0;
        for (int i = 0; i < secondArray.length; i++) {
            sum = sum + secondArray[i];
        }
        secondArrayAverage = (float) sum / secondArray.length;
        return secondArrayAverage;
    }
}
