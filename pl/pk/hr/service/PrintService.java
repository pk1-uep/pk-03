package pl.pk.hr.service;

import pl.pk.hr.model.Employee;

public class PrintService {

    public static void printEmployee(Employee emp) {
        System.out.println(emp.getFullName());

        double salary = emp.getSalary();
        String salaryStr = String.format("%.2f", salary);
        System.out.println(" - wynagrodzenie: " + salaryStr + " zł");

        // wersja 1 - wydruk "do wypłaty"
        // double netSalary = emp.getNetSalary();
        // String netSalaryStr = String.format("%.2f", netSalary);
        // System.out.println(" - do wypłaty: " + netSalaryStr + " zł");

        // wersja 2 - wydruk "do wypłaty"
        // String text = String.format(" - do wypłaty: %.2f zł", emp.getNetSalary());
        // System.out.println(text);

        // wersja 3 - wydruk "do wypłaty"
        System.out.println(String.format(" - do wypłaty: %.2f zł", emp.getNetSalary()));

        System.out.println(" - staż pracy [w latach]: " + emp.getHirePeriod());
        System.out.println();
    }
}
