package pl.pk.hr;

import pl.pk.hr.model.Employee;

public class Application {

    public static void main(String[] args) {
        Employee nowak = new Employee("Jan", "Nowak", 4500, 2008);
        Employee kowal = new Employee("Ewa", "Aleksandra", "Kowalska", 6700, 1999);
        Employee kroll = new Employee("Maria", "Anna", "Zięba", 2700, 2019);

        // nowak
        System.out.println(nowak.getFullName());
        System.out.println(" - wynagrodzenie: " + nowak.getSalary() + " zł");
        System.out.println(" - do wypłaty: " + nowak.getNetSalary() + " zł");
        System.out.println(" - staż pracy: " + nowak.getHirePeriod());

        // zmiana składki zdrowotnej
        Employee.setHealth(11.0);    // od tego momentu wszystkie obiekty klasy Employee "widzą" nową wartość atrybutu "health"

        // kowal
        System.out.println(kowal.getFullName());
        System.out.println(" - wynagrodzenie: " + kowal.getSalary() + " zł");
        System.out.println(" - do wypłaty: " + kowal.getNetSalary() + " zł");
        System.out.println(" - staż pracy: " + kowal.getHirePeriod());

        // kroll
        System.out.println(kroll.getFullName());
        System.out.println(" - wynagrodzenie: " + kroll.getSalary() + " zł");
        System.out.println(" - do wypłaty: " + kroll.getNetSalary() + " zł");
        System.out.println(" - staż pracy: " + kroll.getHirePeriod());
    }

}
