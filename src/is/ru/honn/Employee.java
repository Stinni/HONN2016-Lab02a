package is.ru.honn;

import java.util.Date;

/**
 * Klasinn Person (Person.java)
 * TODO: Add description
 *
 * @author Kristinn Heiðar Freysteinsson
 * @version 1, 03.09.16
 */
public class Employee extends Person {
    protected Date dateOfHire;

    public Person(String name, Date dateOfBirth, Date dateOfHire) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public String toString()
    {
        return "Employee: " + getName() + ", hired " + getDateOfHire();
    }
}
