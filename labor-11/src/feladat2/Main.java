package feladat2;
import feladat1.MyDate;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Company company = new Company("MyCompany");
        File inputFile = new File("employees.csv");
        Scanner scanner = new Scanner(inputFile);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String firstName = parts[0].trim();
            String lastName = parts[1].trim();
            double salary = Double.parseDouble(parts[2].trim());
            int year = Integer.parseInt(parts[3].trim());
            int month = Integer.parseInt(parts[4].trim());
            int day = Integer.parseInt(parts[5].trim());
            MyDate birthDate = new MyDate(year, month, day);
            if (parts.length == 7){
                String department = parts[6].trim();
                Employee employee = new Manager(department, firstName, lastName, salary, birthDate);
                company.hire(employee);
            }else{
                Employee employee = new Employee(firstName, lastName, salary, birthDate);
                company.hire(employee);
            }
        }
        scanner.close();
        company.printAll(System.out);
        company.printManagers(System.out);
        company.sortByComparator((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        company.printAll(System.out);
    }
}