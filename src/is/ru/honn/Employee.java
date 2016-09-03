package is.ru.honn;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Klasinn Employee (Employee.java)
 * TODO: Add description
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
public class Employee extends Person implements Worktime {

    protected GregorianCalendar dateOfHire;
    protected double salary;

    public Employee() {}

    public Employee(String name, GregorianCalendar dateOfBirth, GregorianCalendar dateOfHire) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
    }

    public String getDateOfHire() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.YYYY");
        fmt.setCalendar(dateOfHire);
        return fmt.format(dateOfHire.getTime());
    }

    public void setDateOfHire(GregorianCalendar dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDays(Date now)
    {
        Date tmp = dateOfHire.getTime();
        return (int)((now.getTime() - tmp.getTime()) / 86400000);
    }

    public String toString()
    {
        return "Employee: " + getName() + ", hired " + getDateOfHire();
    }
}
