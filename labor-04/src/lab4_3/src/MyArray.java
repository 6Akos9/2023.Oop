import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class MyArray {
    private double[] data;

    public MyArray(int length) {
        data = new double[length];
    }
    public MyArray(double[] arr) {
        data = Arrays.copyOf(arr, arr.length);
    }
    public MyArray(MyArray arr) {
        this(arr.data);
    }
    public MyArray(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int length = scanner.nextInt();
        data = new double[length];
        for (int i = 0; i < length; i++) {
            data[i] = scanner.nextDouble();
        }
        scanner.close();
    }
    public void fillRandom(double a, double b) {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = a + (b - a) * random.nextDouble();
        }
    }
    public double mean() {
        double sum = 0.0;
        for (double value : data) {
            sum += value;
        }
        return sum / data.length;
    }
    public double stddev() {
        double mean = mean();
        double sum = 0.0;
        for (double value : data) {
            sum += (value - mean) * (value - mean);
        }
        return Math.sqrt(sum / (data.length - 1));
    }
    public void sort() {
        Arrays.sort(data);
    }
    public void print(String a1) {
        for (double value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
