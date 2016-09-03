package is.ru.honn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Forritið Test1 (Test1.java)
 * Býr til tilvik af Employee og Manager og prentar út
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
public class Test1 {
    public static void main(String[] args) {

        ArrayList<Person> staff = new ArrayList();
        Employee p1 = new Employee("Danny", new GregorianCalendar(1981, 9, 1), new GregorianCalendar(2007, 10, 5));
        p1.setSalary(2000);
        staff.add(p1);
        Employee p2 = new Employee("Erika", new GregorianCalendar(1988, 10, 19), new GregorianCalendar(2001, 10, 1));
        p2.setSalary(2100);
        staff.add(p2);
        Employee p3 = new Employee("Fred", new GregorianCalendar(1982, 9, 1), new GregorianCalendar(2001, 10, 1));
        p3.setSalary(2200);
        staff.add(p3);
        Employee p4 = new Employee("Grace", new GregorianCalendar(1983, 9, 1), new GregorianCalendar(2001, 10, 1));
        p4.setSalary(2300);
        staff.add(p4);
        Employee p5 = new Employee("Henri", new GregorianCalendar(1984, 9, 1), new GregorianCalendar(2001, 10, 1));
        p5.setSalary(2400);
        staff.add(p5);
        Manager p6 = new Manager("Ida", "The Boss",  new GregorianCalendar(1985, 9, 1), new GregorianCalendar(1990, 10, 1));
        p6.setSalary(3200);
        staff.add(p6);

        Collections.sort(staff);

        for (Object aStaff : staff)
        {
            Person p = (Person)aStaff;
            Worktime w = (Worktime)aStaff;
            System.out.println(p.getName() + ": " + w.getWorkDays(new Date()));
        }
    }
}
