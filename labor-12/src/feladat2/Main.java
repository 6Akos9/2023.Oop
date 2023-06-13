package feladat2;

public class Main {
    public static void main(String[] args) {
        long startTime4 =System.nanoTime();
        Storage storage4 = new Storage("labor-12/src/update1000000.txt");
        storage4.update("labor-12/src/update1000000.txt");
        long elapsedTime4 = System.nanoTime() - startTime4;
        System.out.println("Execution time: " +elapsedTime4/1000000);
    }
}