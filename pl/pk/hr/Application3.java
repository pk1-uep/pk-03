package pl.pk.hr;

import pl.pk.hr.model.Employee;
import pl.pk.hr.service.PrintService;

public class Application3 {

    public static void main(String[] args) {
        Employee nowak = new Employee("Jan", "Nowak", 4500, 2008);
        Employee kowal = new Employee("Ewa", "Aleksandra", "Kowalska", 6700, 1999);
        Employee kroll = new Employee("Maria", "Anna", "Zięba", 2700, 2019);

        PrintService.printEmployee(nowak);
        PrintService.printEmployee(kowal);
        PrintService.printEmployee(kroll);
    }

}
