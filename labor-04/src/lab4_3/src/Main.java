import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        double[] arr1 = {4, 9, 0, -34, 28, 76, 100, -1};
        MyArray a1 = new MyArray(arr1);
        System.out.print("a1: ");
        a1.print("a1");
        a1.sort();
        System.out.print("a1: ");
        a1.print("a1");
        System.out.println("Mean: " + a1.mean() + " Stddev: " + a1.stddev());


        MyArray a2 = new MyArray("lab4_3_input.txt");
        System.out.print("a2: ");
        a2.print("a2");
        a2.sort();
        System.out.print("a2: ");
        a2.print("a2");
        System.out.println("Mean: " + a2.mean() + " Stddev: " + a2.stddev());


        MyArray a3 = new MyArray(5);
        a3.fillRandom(-2, 2);
        System.out.print("a3: ");
        a3.print("a3");
        a3.sort();
        System.out.print("a3: ");
        a3.print("a3");
        System.out.println("Mean: " + a3.mean() + " Stddev: " + a3.stddev());


        MyArray a4 = new MyArray(a2);
        System.out.print("a4: ");
        a4.print("a4");
    }
}