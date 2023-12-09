import java.util.Arrays;
import java.util.HashMap;
public class exammeanmodemedian{
    public static void main(String[] args) {
        int[] array = {16,18,27,16,23,21,19};
        double mean = calculateMean(array);
        System.out.println("Mean: " + mean);
        double median = calculateMedian(array);
        System.out.println("Median: " + median);
    }
    private static double calculateMean(int[] array) {
        int sum = Arrays.stream(array).sum();
        return (double) sum / array.length;
    }
    private static double calculateMedian(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (array[length / 2 - 1] + array[length / 2]) / 2.0;
        } else {
            return array[length / 2];
        }
    }
}
