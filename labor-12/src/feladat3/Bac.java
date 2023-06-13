package feladat3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private HashMap<Integer, Student> students = new HashMap<>();

    public Bac(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] tokens = line.split(" ");
                int id = Integer.parseInt(tokens[0].trim());
                String firstName = tokens[1].trim();
                String lastName = tokens[2].trim();
                students.put(id, new Student(id, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        readExamResults("Magyar", "labor-12/src/magyar.txt");
        readExamResults("Roman", "labor-12/src/roman.txt");
        readExamResults("Matek", "labor-12/src/matek.txt");
        calculateAvarage();
    }

    private void calculateAvarage() {
        for (Integer item : students.keySet()) {
            students.get(item).setAvg();
        }
    }

    public int passed() {
        int counter = 0;
        for (Map.Entry<Integer, Student> student : students.entrySet()) {
            if (student.getValue().passed()) {
                counter++;
            }
        }
        return counter;
    }

    private void readExamResults(String subject, String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                String[] tokens = line.split(" ");
                int id = Integer.parseInt(tokens[0].trim());
                double mark = Double.parseDouble(tokens[1].trim());
                Student temp = students.get(id);
                if (temp != null) {
                    temp.addMark(subject, mark);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer("All students:\n");
        for (Map.Entry<Integer, Student> student : students.entrySet()) {
            result.append(student.getValue());
        }
        return result.toString();
    }
}
