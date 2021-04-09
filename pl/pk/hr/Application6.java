package pl.pk.hr;

import pl.pk.hr.model.Employee;
import pl.pk.hr.service.PrintService;
import pl.pk.hr.service.ReadService;

public class Application6 {

    public static void main(String[] args) {
        Employee nowak = new Employee("Jan", "Nowak", 4500, 2008);
        Employee kowal = new Employee("Ewa", "Aleksandra", "Kowalska", 6700, 1999);
        Employee kroll = new Employee("Maria", "Anna", "Zięba", 2700, 2019);

        Employee[] empArray = new Employee[3];
        empArray[0] = nowak;
        empArray[1] = kowal;
        empArray[2] = kroll;

        while (true) {
            int empNo = ReadService.readInt("Podaj numer pracownika (1-3): ");
            if (empNo < 1 || empNo > 3) {
                System.out.println("Niepoprawny numer pracownika!");
                continue;
            }

            Employee emp = empArray[empNo - 1];
            PrintService.printEmployee(emp);

            String end = ReadService.readString("Czy zakończyć (t/n)? ");
            if (end.equals("t")) {
                System.out.println("Koniec pracy.");
                break;
            }
        }
    }

}
