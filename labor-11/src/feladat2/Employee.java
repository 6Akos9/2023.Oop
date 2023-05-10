package feladat2;

import feladat1.MyDate;

public class Employee {
    private final int ID;
    private final String firstName;
    private String lastName;
    private double salary;
    private final MyDate birthDate;
    private int counter;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        ID = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
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

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" +
                "|ID=" + ID +
                "|firstName='" + firstName + '\'' +
                "|lastName='" + lastName + '\'' +
                "|salary=" + salary +
                "|birthDate=" + birthDate +
                "|counter=" + counter +
                '|';
    }
}
