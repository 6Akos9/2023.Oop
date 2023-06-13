package feladat3;

public class Main {
    public static void main(String[] args) {
        Bac bac = new Bac("labor-12/src/nevek.txt");
        System.out.println(bac);
        System.out.println("Students passed: " + bac.passed());
    }
}