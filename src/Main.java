import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
    int [] inputArray1 = {3200, 2400, 5500, 4800, 2300};
    double [] outputArray1 = new double[4];

    int sum = 0;
    int max = inputArray1 [0];
    int min = inputArray1 [0];

        for (int value : inputArray1) {
            sum += value;
            if (value > max) max = value;
            if (value < min) min = value;
        }
    double average = (double) sum / inputArray1.length;

        outputArray1 [0] = sum;
        outputArray1 [1] = max;
        outputArray1 [2] = min;
        outputArray1 [3] = average;

        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));

        System.out.println("Task 2");
        int [] inputArray2 = {50000, 40000, 65000, 75000, 69000};
        float [] outputArray2 = new float [inputArray2.length];

        int index = 0;
        for (int value : inputArray2){
            outputArray2 [index] = value * 0.13f;
            index++;
        }
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2" + Arrays.toString(outputArray2));

        System.out.println("Task 3");
        int [] inputArray3 = {5300, 5600, 3000, 2200, 3400};
        boolean [] outputArray3 = new boolean[inputArray3.length];

        int index1 = 0;
        for (int value : inputArray3) {
            outputArray3 [index1] = value > 5000;
            index1++;
        }
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));

        System.out.println("Task 4");
        int [] inputArray4 = {2000, 4000, -2200, 900, 5000};
        boolean [] outputArray4 = new boolean[1];

        boolean noDelays = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                noDelays = false;
                break;
            }
        }
        outputArray4[0] = noDelays;

        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));

        System.out.println("Task 5");
        int[] inputArray5 = {40000, -3000, 2000, 0, 500000};
        int[] outputArray5 = new int[1];

        int countProfitMonths = 0;
        for (int profit : inputArray5){
            if (profit > 0){
                countProfitMonths++;
            }
        }
         outputArray5[0] = countProfitMonths;

        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));
    }
}