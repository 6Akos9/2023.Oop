import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readFromCSVFile("D:\\GitHub-Oop\\labor-04\\src\\lab4_2\\lab4_2_input.csv");
        System.out.println(customers);
    }
    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                int accounts = Integer.parseInt(items[2].trim());
                customers.add(new Customer(firstName, lastName, accounts));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}