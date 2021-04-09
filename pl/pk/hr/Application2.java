package pl.pk.hr;

import pl.pk.hr.model.Employee;

public class Application2 {

    public static void main(String[] args) {
        Employee nowak = new Employee("Jan", "Nowak", 4500, 2008);
        Employee kowal = new Employee("Ewa", "Aleksandra", "Kowalska", 6700, 1999);
        Employee kroll = new Employee("Maria", "Anna", "Zięba", 2700, 2019);

        printEmployee(nowak);
        printEmployee(kowal);
        printEmployee(kroll);
    }

    public static void printEmployee(Employee emp) {
        System.out.println(emp.getFullName());
        System.out.println(" - wynagrodzenie: " + emp.getSalary() + " zł");
        System.out.println(" - do wypłaty: " + emp.getNetSalary() + " zł");
        System.out.println(" - staż pracy: " + emp.getHirePeriod());
        System.out.println();
    }

}
