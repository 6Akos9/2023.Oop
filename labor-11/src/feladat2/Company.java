package feladat2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee employee){
        employees.add(employee);
    }
    public void hireAll(List<Employee> newEmployees){
        for (Employee employee : employees){
            hire(employee);
        }
    }
    public void fire(Employee employee){
        employees.remove(employee);
    }
    public void printAll(PrintStream out) {
        out.println("Employees of " + name + ":");
        for (Employee employee : employees) {
            out.println(employee);
        }
    }
    public void printManagers(PrintStream out){
        System.out.println("Managers of"+name+":");
        for (Employee employee : employees){
            if (employee instanceof Manager){
                System.out.println(employee);
            }
        }
    }
    public void sortByComparator(Comparator<Employee> comparator){
        if (employees != null){
            employees.sort(comparator);
        }
    }

}
