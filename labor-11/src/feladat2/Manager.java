package feladat2;

import feladat1.MyDate;

public class Manager extends Employee{
    private String department;

    public Manager(String department, String firstName, String lastName, double salary, MyDate birthDate) {
        super(firstName, lastName, salary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager|" +
                "department:" + department + '\'' +
                '|';
    }
}
