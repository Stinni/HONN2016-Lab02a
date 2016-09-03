package is.ru.honn;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Klasinn Person (Person.java)
 * TODO: Add description
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
abstract public class Person implements Comparable {

    protected String name;
    protected GregorianCalendar dateOfBirth;

    public Person(){}

    public Person(String name, GregorianCalendar dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.YYYY");
        fmt.setCalendar(dateOfBirth);
        return fmt.format(dateOfBirth.getTime());
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int compareTo(Object o) {
        Person p = (Person)o;
        return this.name.compareTo(p.getName());
    }

    public abstract double getSalary();

    public String toString ()
    {
        return "Person: " + getName();
    }
}
