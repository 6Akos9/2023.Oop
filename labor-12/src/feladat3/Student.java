package feladat3;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private final int ID;
    private final String firstName;
    private final String lastName;
    private double avarage;

    public double getAvarage() {
        return avarage;
    }

    private Map<String, Double> marks = new HashMap<>();

    public Student(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return
                "id: " + ID +
                        " " + firstName + ' ' +
                        " " + lastName + "\n " + getExamResults();
    }

    public String getExamResults() {
        StringBuffer result = new StringBuffer();
        for (Map.Entry<String, Double> item : marks.entrySet()) {
            result.append("\t").append(item.getKey()).append(": ").append(item.getValue()).append("\n");
        }
        return result.toString();
    }

    public void addMark(String subjectName, Double mark) {
        marks.put(subjectName, mark);
    }

    public void setAvg() {
        double Avg = 0;
        for (Map.Entry<String, Double> item : marks.entrySet()) {
            Avg += item.getValue();
        }
        Avg = Avg / marks.size();
        avarage = Avg;
    }

    public boolean passed() {
        for (Map.Entry<String, Double> mark : marks.entrySet()) {
            if (mark.getValue() < 5) {
                return false;
            }
        }
        return avarage >= 6;
    }
}
