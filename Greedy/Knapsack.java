import java.util.Arrays;
import java.util.Comparator;

public class Knapsack {

    public static void main(String[] args) {

        int capacity = 50;

        int[] value = {60, 100, 120};
        int[] weight = {10, 20, 30};

        double[][] ratio = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i; // store index
            ratio[i][1] = (double) value[i] / weight[i]; // value/weight
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double finalVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {

            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) {
                finalVal += value[idx];
                capacity -= weight[idx];
            } 
            else {
                finalVal += ratio[i][1] * capacity;
                break;
            }
        }

        System.out.println("Final Value: " + finalVal);
    }
}