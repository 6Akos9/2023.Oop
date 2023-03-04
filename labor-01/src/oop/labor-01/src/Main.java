import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nProblem 2. - print name by chars\n");
        String name = "Balazs Akos";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        System.out.println("\nProblem 3. - split name by spaces\n");
        String[] splitName = name.split(" ");
        String[] d = name.split(" ");
        for(int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }
        System.out.println("\nProblem 4. - print name in word pyramid\n");
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.substring(0, i + 1));
        }

        System.out.println("\nProblem 5. - max in array\n");
        double[] x = {6, 1, 2, 3};
        double[] x1 = {};
        double[] x2 = {-123};
        System.out.printf("MAX: %6.2f\n", maxElement(x));
        System.out.printf("MAX: %6.2f\n", maxElement(x1));
        System.out.printf("MAX: %6.2f\n", maxElement(x2));

        System.out.println("\nProblem 6. - return the value of a given bit in number\n");
        System.out.println(getBit(13, 1));
        System.out.println("\nProblem 7. - counts the number of ‘1’ bits\n");
        System.out.println(countBits(3));
        System.out.println("\nProblem 8. -  computes the mean of an array\n");
        System.out.println(mean(x));
        System.out.println("\nProblem 9. -  computes the deviation of an array\n");
        System.out.println(deviaton(x, mean(x)));
    }

    public static double maxElement(double array[]) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static byte getBit(int number, int order) {

        if (order < 0 || order > 32) {
            return -1;
        }
        return (byte) (number >> order & 1);

    }

    public static int countBits(int number) {
        int count = 0;
        for (int i = 0; i < 32; ++i) {
            if ((number >>> i) % 2 == 1) {
                ++count;
            }
        }
        return count;
    }

    public static double mean(double array[]) {
        int count = 0;
        double S = 0;
        for (int i = 0; i < array.length; i++) {
            S = S + array[i];
            count++;
        }
        S = S / count;
        return S;
    }

    public static double deviaton(double array[], double mean) {
        double S = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - mean;
            array[i] = array[i] * array[i];
            S = S + array[i];
        }
        S = S / array.length;
        S = Math.sqrt(S);
        return S;
    }
}