package pl.pk.hr.model;

import java.time.Year;

public class Employee {

    private static double zus = 9.76 + 1.50 + 2.45;     // Składka: emerytalna + rentowa + chorobowa
    private static double health = 9.0;                 // Składka: zdrowotna
    private static double tax = 17.0;                   // Podatek dochodowy

    private String firstName;
    private String middleName;
    private String lastName;
    private double salary;
    private int hireYear;

    // ********************* Constructor ************************
    public Employee(String firstName, String lastName, double salary, int hireYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hireYear = hireYear;
    }
    public Employee(String firstName, String middleName, String lastName, double salary, int hireYear) {
        /*
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.hireYear = hireYear;
        */
        this(firstName, lastName, salary, hireYear);
        this.middleName = middleName;
    }

    // ********************** Business methods *********************
    public String getFullName() {
        String full = firstName;
        if (middleName != null) {
            full = full + " " + middleName;
        }
        full = full + " " + lastName;

        return full;
    }


    public int getHirePeriod() {
        // int currentYear = 2021;
        int currentYear = Year.now().getValue();
        int period = currentYear - hireYear;
        return period;
    }

    public double getNetSalary() {
        // double zus = 9.76 + 1.50 + 2.45;     // Składka: emerytalna + rentowa + chorobowa
        // double health = 9.0;                 // Składka: zdrowotna
        // double tax = 17.0;                   // Podatek dochodowy

        double net = salary;
        net = net - (zus / 100.0) * net;
        net = net - (health / 100.0) * net;
        net = net - (tax / 100.0) * net;

        return net;
    }


    // ********************* Getters & Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHireYear() {
        return hireYear;
    }
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

}
