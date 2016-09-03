package is.ru.honn;

import java.util.Date;

/**
 * Klasinn Person (Person.java)
 * TODO: Add description
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
public class Employee {
    protected Date dateOfBirth;

    public Person(){}

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person: " + getName();
    }
}
